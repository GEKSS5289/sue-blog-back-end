package com.sue.service.admin;

import com.sue.model.vo.FileVO;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

/**
 * @author sue
 * @date 2020/11/18 20:37
 */

public interface FileMngService {
    void uploadFile(Integer userId,MultipartFile file) throws IOException;
    List<FileVO> queryAllFileInfo();
    void updateFileStatus(Integer fileId);
}
