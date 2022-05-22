package com.com.yjs.controller;

import com.yjs.test.TestService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
@Controller
public class TestController   {


    @DubboReference
    private TestService testService;


    @GetMapping("/test")
    public ResponseEntity<String> getByUserId() {
        String s = testService.test1("zhansan");
        return ResponseEntity.ok(s);
    }

 }
