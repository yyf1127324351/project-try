package com.proxy.test;

import com.proxy.ProxyApplication;
import com.proxy.proxyHandle.JiaShi;
import com.proxy.proxyHandle.WangPoProxy;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 类描述：
 * 创建人：yyf
 * 创建时间：2018/6/11 0011下午 05:08
 */

//代理模式：主要使用了java的多态，干活的是被代理的类（潘金莲），代理类主要是接活，但是又幕后的被代理类去做。

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ProxyApplication.class)
public class TestProxyPattern {
    //通过代理去实现某种目的
    @Test
    public void test() {
        WangPoProxy wangPoProxy = new WangPoProxy();
        wangPoProxy.makeEyesWithMan();//王婆代理来处理这个事情，但是实际是潘金莲在做，王婆只是个表面现象
        wangPoProxy.happyWihMan();

        WangPoProxy wangPoProxy1 = new WangPoProxy(new JiaShi());
        wangPoProxy1.makeEyesWithMan();//这次王婆当了 贾氏的代理，去跟管家建立沟通
        wangPoProxy1.happyWihMan();
    }
}
