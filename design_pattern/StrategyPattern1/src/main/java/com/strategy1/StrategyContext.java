package com.strategy1;

/**
 * 类描述：
 * 创建人：yyf
 * 创建时间：2018/5/30 0030下午 03:26
 */
public class StrategyContext {
    private IStrategy strategy;
    public StrategyContext(IStrategy strategy){
        this.strategy = strategy;
    }
    public void handle(){
        strategy.operate();
    }
}
