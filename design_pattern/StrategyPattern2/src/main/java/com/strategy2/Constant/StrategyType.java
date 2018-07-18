package com.strategy2.Constant;

/**
 * Created by Administrator on 2018/6/4 0004.
 */
public enum StrategyType {
    STRATEGY_BOOK,
    STRATEGY_APPLE,
    STRATEGY_BACK;

    public static StrategyType by(String name) {
        for (StrategyType type : StrategyType.values()) {
            if (type.name().equals(name)) return type;
        }
        return null;
    }
}
