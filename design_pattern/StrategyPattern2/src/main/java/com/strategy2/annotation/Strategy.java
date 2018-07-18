package com.strategy2.annotation;

import com.strategy2.Constant.StrategyType;
import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * 类描述：
 * 创建人：yyf
 * 创建时间：2018/6/1 0001上午 10:44
 */
@Target(ElementType.TYPE) //定义注解应用于类
@Retention(RetentionPolicy.RUNTIME) //注解保留至运行时。可以通过反射去获取注解信息。
@Documented
@Component
public @interface Strategy {
    /**
     * 策略类型
     *
     * @return
     */
    StrategyType value();
}
