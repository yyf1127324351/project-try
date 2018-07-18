package com.strategy2.test;

import com.strategy2.Constant.StrategyType;
import com.strategy2.Strategy2Application;
import com.strategy2.StrategyContext;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 类描述：
 * 创建人：yyf
 * 创建时间：2018/5/30 0030下午 04:12
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Strategy2Application.class)
public class TestStrategyPattern {

    @Autowired
    StrategyContext strategyContext;


       @Test
       public void test() {
//           StrategyContext strategyContext;
//           strategyContext = new StrategyContext(new Book());
//           strategyContext.handle();
           strategyContext.handle(StrategyType.STRATEGY_BOOK);
    }
}
