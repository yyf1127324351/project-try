package com.dubbo.consumer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.api.service.DemoService;
import org.springframework.stereotype.Service;

/**
 * 类描述：
 * 创建人：yyf
 * 创建时间：2018/8/17 0017下午 04:08
 */
@Service
public class DubboService {
    @Reference(version = "1.0.0")
    DemoService demoService;

    public String sayHello() {
        return demoService.helloWord("consumer 请求服务!!!");

    }
}
