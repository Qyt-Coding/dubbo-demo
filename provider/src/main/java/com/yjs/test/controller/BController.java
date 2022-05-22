package com.yjs.test.controller;

import com.yjs.test.AService;
import com.yjs.test.TestService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BController {

    @DubboReference(check = false)
    private AService aService;


    @GetMapping("/test")
    public ResponseEntity<String> selectA() {
        String s = aService.sayHello("wangwu");
        return ResponseEntity.ok(s);
    }

}
