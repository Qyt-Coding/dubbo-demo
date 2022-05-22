package com.yjs.controller.service;

import com.yjs.test.AService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class AServiceImpl implements AService {
    @Override
    public String sayHello(String name) {

        return "sayHello："+ name;
    }
}
