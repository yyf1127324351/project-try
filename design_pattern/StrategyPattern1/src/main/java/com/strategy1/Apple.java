package com.strategy1;

/**
 * 类描述：
 * 创建人：yyf
 * 创建时间：2018/5/30 0030下午 02:07
 */

public class Apple implements IStrategy {
    @Override
    public void operate() {
        System.out.println("apple 策略");
    }
}
