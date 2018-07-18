package com.proxy.proxyHandle;

/**
 * 类描述：
 * 创建人：yyf
 * 创建时间：2018/6/11 0011下午 04:56
 */

public class PanJinLian implements WomanInterface {
    @Override
    public void makeEyesWithMan() {
        System.out.println("潘金莲抛媚眼");
    }

    @Override
    public void happyWihMan() {
        System.out.println("潘金莲和男人happy");
    }
}
