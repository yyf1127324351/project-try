package com.dubbo.consumer.controller;

import com.dubbo.consumer.service.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类描述：
 * 创建人：yyf
 * 创建时间：2018/8/16 0016下午 05:22
 */
@RestController
@RequestMapping("/dubbo/demo/")
public class DubboController {
    @Autowired
    DubboService dubboService;

    @GetMapping("sayHello")
    public String sayHello() {

        return dubboService.sayHello();
    }

}
