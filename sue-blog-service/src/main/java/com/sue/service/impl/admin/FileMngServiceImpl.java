package com.sue.service.impl.admin;

import com.sue.common.enums.ErrorEnums;
import com.sue.common.enums.FileStatusEnums;
import com.sue.model.vo.FileVO;
import com.sue.support.exception.assist.ExceptionPerformer;
import com.sue.support.exception.assist.FileEjector;
import com.sue.mapper.FileMapper;
import com.sue.model.entity.File;
import com.sue.service.admin.FileMngService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;
import tk.mybatis.mapper.entity.Example;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author sue
 * @date 2020/11/18 20:37
 */
@Service
public class FileMngServiceImpl implements FileMngService {

    @Autowired
    private FileMapper fileMapper;

    @Autowired
    private FileEjector fileEjector;

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void uploadFile(Integer userId, MultipartFile file) throws IOException {


        String resultPath = fileEjector.launch(file);

        Date date = new Date();
        File tempFile = new File();
        long fileSize = file.getSize()/1024;
        tempFile.setFileName(file.getOriginalFilename());
        tempFile.setFileSize(fileSize);
        tempFile.setFileUsable(FileStatusEnums.PROVIDE.getCode());
        tempFile.setUserId(userId);
        tempFile.setUpdatedTime(date);
        tempFile.setCreatedTime(date);
        tempFile.setFilePath(resultPath);

        fileMapper.insert(tempFile);


    }

    @Override
    public List<FileVO> queryAllFileInfo() {

        Example example = new Example(File.class);
        Example.Criteria criteria = example.createCriteria();
        example.orderBy("createdTime").desc();

        List<FileVO> collect = fileMapper.selectByExample(example)
                .stream()
                .map(File::toFileVO)
                .collect(Collectors.toList());

        return collect;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void updateFileStatus(Integer fileId) {
        File file = new File();
        file.setId(fileId);
        File file1 = fileMapper.selectByPrimaryKey(file);
        if(file1 == null){
            ExceptionPerformer.Execute(ErrorEnums.NOT_FOUND_RESOURCE);
        }
        file1.setFileUsable(!file1.getFileUsable());
        fileMapper.updateByPrimaryKey(file1);
    }
}
