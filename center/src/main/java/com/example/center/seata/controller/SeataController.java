package com.example.center.seata.controller;

import com.example.common.base.ResponseResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: lxp
 * @date: 2021/8/4 13:15
 */
@RestController
@RequestMapping("/seata")
public class SeataController {


    @GetMapping("/save")
    public ResponseResult save(){


        return ResponseResult.success();
    }
}
