package com.yjs.test.controller;

import com.yjs.test.AService;
import com.yjs.test.TestService;
import com.yjs.test.config.DubboConfig;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BController {

    @DubboReference(check = false,url = DubboConfig.URL)
    private AService aService;

    @Autowired

    @GetMapping("/test")
    public ResponseEntity<String> selectA() {
        String s = aService.sayHello("wangwu");
        return ResponseEntity.ok(s);
    }

}
