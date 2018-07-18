package com.factory.test;

import com.factory.FactoryApplication;
import com.factory.factoryHandle.ClassTool;
import com.factory.factoryHandle.Human;
import com.factory.factoryHandle.HumanFactory;
import com.factory.factoryHandle.YellowHuman;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * 类描述：
 * 创建人：yyf
 * 创建时间：2018/6/21 0021上午 09:40
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = FactoryApplication.class)
public class TestFactoryPattern {

    @Test
    public void test(){
        Human yellowHuman = HumanFactory.createHuman(YellowHuman.class);
        yellowHuman.cry();
        yellowHuman.laugh();
        yellowHuman.talk();
    }

    @Test
    public void test2(){
        Human human = HumanFactory.createHuman();
        human.cry();
        human.laugh();
        human.talk();
    }
    @Test
    public void test3(){
        List<Class> concreteHumanList = ClassTool.getAllClassByInterface(Human.class);
        System.out.println(concreteHumanList);
    }




}
