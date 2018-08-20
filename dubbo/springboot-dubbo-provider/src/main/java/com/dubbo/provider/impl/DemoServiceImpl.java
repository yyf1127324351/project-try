package com.dubbo.provider.impl;
import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.api.service.DemoService;


/**
 * 类描述：
 * 创建人：yyf
 * 创建时间：2018/8/14 0014下午 05:31
 */
@Service( version = "1.0.0")
public class DemoServiceImpl implements DemoService {
    @Override
    public String helloWord(String str) {
        System.out.println("---dubbo发布服务---" );
        return str;
    }
}
