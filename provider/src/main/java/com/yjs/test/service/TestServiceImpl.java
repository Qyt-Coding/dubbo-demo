package com.yjs.test.service;

import com.yjs.test.TestService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class TestServiceImpl implements TestService {
    @Override
    public String test1(String name) {
        System.out.println("打印："+name);
        return "你好啊："+name;
    }

//    @Override
//    public String test1(String name) {
//        System.out.println("打印："+name);
//        return "你好啊："+name;
//    }
}
