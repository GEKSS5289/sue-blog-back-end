package com.sue.service.impl.admin;

import com.sue.common.enums.FileStatusEnums;
import com.sue.common.utils.FileEjector;
import com.sue.mapper.FileMapper;
import com.sue.model.entity.File;
import com.sue.service.admin.FileMngService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Date;

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

        fileEjector.check(file);
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
}
