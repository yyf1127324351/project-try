package com.adapter1.test;

import com.adapter1.Adapter1Application;
import com.adapter1.adapterHandle.AdapteePerson;
import com.adapter1.adapterHandle.Adapter;
import com.adapter1.adapterHandle.ITagerPerson;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 类描述： 类适配器
 * 创建人：yyf
 * 创建时间：2018/6/13 0013上午 11:31
 */
//        目标（Target）：定义一个客户端使用的特定接口。
//        客户端（Client）：使用目标接口，与和目标接口一致的对象合作。
//        被适配者（Adaptee）：一个现存需要适配的接口。
//        适配器（Adapter）：负责将Adaptee的接口转换为Target的接口。适配器是一个具体的类，这是该模式的核心。
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Adapter1Application.class)
public class TestAdapterPattern {

    @Test
    public void test(){
        ITagerPerson person = new Adapter();

        person.sayChinese();
        person.sayEnglish();
        person.sayFrench();
        System.out.println(person.getPhone());
    }

}
