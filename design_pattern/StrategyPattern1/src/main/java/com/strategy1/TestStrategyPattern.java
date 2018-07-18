package com.strategy1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 类描述：
 * 创建人：yyf
 * 创建时间：2018/5/30 0030下午 04:12
 */


//策略模式：实现了高内聚低耦合，扩展性好，策略类可以一直增加，只需要修改Context类即可
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Strategy1Application.class)
public class TestStrategyPattern {

       @Test
       public void test() {
           StrategyContext strategyContext;
           strategyContext = new StrategyContext(new Book());
           strategyContext.handle();
           System.out.println("book strategy done----------------------");
    }
}
