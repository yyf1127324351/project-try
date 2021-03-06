package com.factory.factoryHandle;

/**
 * 类描述：
 * 创建人：yyf
 * 创建时间：2018/6/21 0021上午 11:29
 */

public class BlackHuman implements Human {
    @Override
    public void laugh() {
        System.out.println("黑人会笑");
    }

    @Override
    public void talk() {
        System.out.println("黑人会说话");
    }

    @Override
    public void cry() {
        System.out.println("黑人会哭");
    }
}
