package com.sue.api.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @author sue
 * @date 2020/10/17 21:53
 */

@RestController
@RequestMapping("test")
public class TestController {


    @GetMapping("testapi")
    public String getTestApi(){

        return null;
    }

    @PostMapping("testapi")
    public String postTestApi(){
        return null;
    }



}
