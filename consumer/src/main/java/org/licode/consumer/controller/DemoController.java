package org.licode.consumer.controller;

import org.apache.dubbo.config.annotation.DubboReference;
import org.licode.service.DemoService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @DubboReference
    private DemoService demoService;

    @RequestMapping("/sayHello/{name}")
    public String sayHello(@PathVariable(name = "name") String name) {
        return demoService.sayHello(name);
    }
}
