package com.strategy2;

import com.strategy2.Constant.StrategyType;
import com.strategy2.annotation.Strategy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 类描述：
 * 创建人：yyf
 * 创建时间：2018/6/4 0004下午 05:41
 */
@SuppressWarnings({ "rawtypes", "unchecked" })
@Component
public class StrategyContext implements InitializingBean, ApplicationContextAware {

    private ApplicationContext applicationContext;

    private Map<StrategyType, List<StrategyInterface>> handlersCache = new HashMap<>();
    public void handle(StrategyType strategyType){
        StrategyInterface strategy = getStrategy(strategyType);
        if (strategy != null){
            strategy.operate();
        }else {
            System.out.println("strategy fail");
        }


    }

    private StrategyInterface getStrategy(StrategyType strategyType) {
        List<StrategyInterface> handlers = handlersCache.get(strategyType);
        for (StrategyInterface handler : handlers) {
                return handler; // TODO 是否可以改为返回集合
        }
        return null;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        Map<String, StrategyInterface> handlersMap = applicationContext.getBeansOfType(StrategyInterface.class);
        for (StrategyInterface handler : handlersMap.values()) {
            checkStrategyAnnotation(handler);
            Strategy strategy = handler.getClass().getAnnotation(Strategy.class);
            StrategyType type = strategy.value();
            List<StrategyInterface> handlers = handlersCache.get(type);
            if (handlers == null || handlers.isEmpty()) {
                handlers = new ArrayList<>();
                handlersCache.put(type, handlers);
            }
            handlers.add(handler);
        }
    }
    private void checkStrategyAnnotation(StrategyInterface handler) {
        Assert.notNull(handler.getClass().getAnnotation(Strategy.class),
                handler.getClass() + " must be specified annotation @Strategy. ");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
