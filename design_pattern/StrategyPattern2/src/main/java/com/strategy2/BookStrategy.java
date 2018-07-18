package com.strategy2;

import com.strategy2.Constant.StrategyType;
import com.strategy2.annotation.Strategy;

/**
 * 类描述：
 * 创建人：yyf
 * 创建时间：2018/6/4 0004下午 05:29
 */
@Strategy(StrategyType.STRATEGY_BOOK)
public class BookStrategy implements StrategyInterface {
    @Override
    public void operate() {
        System.out.println("book strategy");
    }
}
