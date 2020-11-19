package com.sue.api.controller.admin;

import com.sue.model.dto.FileVO;
import com.sue.service.admin.FileMngService;
import com.sue.support.response.ResponseContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.IOException;
import java.util.List;

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
    public ResponseContainer uploadFile(@RequestParam Integer userId,MultipartFile file) throws IOException {

        fileMngService.uploadFile(userId,file);
        return ResponseContainer.ideality();
    }

    @GetMapping("file")
    public ResponseContainer queryAllFile(){
        List<FileVO> fileVOS = fileMngService.queryAllFileInfo();
        return ResponseContainer.ideality(fileVOS);
    }
}
