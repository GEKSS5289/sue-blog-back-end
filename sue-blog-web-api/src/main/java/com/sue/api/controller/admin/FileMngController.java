package com.sue.api.controller.admin;

import com.sue.service.admin.FileMngService;
import com.sue.support.response.ResponseContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.io.IOException;

/**
 * @author sue
 * @date 2020/11/18 20:35
 */


@RestController
@RequestMapping("admin")
public class FileMngController {



    @Autowired
    private FileMngService fileMngService;


    @PostMapping("file")
    public ResponseContainer uploadFile(@RequestParam Integer userId, MultipartFile file) throws IOException {

        fileMngService.uploadFile(userId,file);
        return ResponseContainer.ideality();
    }
}
