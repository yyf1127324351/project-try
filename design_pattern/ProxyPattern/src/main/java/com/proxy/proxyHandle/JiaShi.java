package com.proxy.proxyHandle;

/**
 * 类描述： 贾氏类
 * 创建人：yyf
 * 创建时间：2018/6/11 0011下午 05:25
 */

public class JiaShi implements  WomanInterface {
    @Override
    public void makeEyesWithMan() {
        System.out.println("贾氏和管家抛媚眼");
    }

    @Override
    public void happyWihMan() {
        System.out.println("贾氏和管家happy");
    }
}
