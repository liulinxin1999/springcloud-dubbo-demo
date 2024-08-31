package org.licode.provider.service;

import org.apache.dubbo.config.annotation.DubboService;
import org.licode.service.DemoService;

/**
 * @author : by liulinxin
 * @date : created 2024/8/30 16:41
 * @description:
 */

@DubboService
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
