package com.sue.service.admin;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * @author sue
 * @date 2020/11/18 20:37
 */

public interface FileMngService {
    void uploadFile(Integer userId,MultipartFile file) throws IOException;
}
