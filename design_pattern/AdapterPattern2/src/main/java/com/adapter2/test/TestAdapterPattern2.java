package com.adapter2.test;

import com.adapter2.Adapter2Application;
import com.adapter2.adapterHandle.AdapteePerson;
import com.adapter2.adapterHandle.Adapter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 类描述： 对象适配器
 * 创建人：yyf
 * 创建时间：2018/6/13 0013上午 11:31
 */
//所谓对象适配器，简单的说就是适配器实现我们的目标接口，但是并不继承需要被适配的类。而是通过在适配器的构造函数中将需要被适配的类传递进来从而进行适配
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Adapter2Application.class)
public class TestAdapterPattern2 {

    @Test
    public void test(){
        Adapter person = new Adapter(new AdapteePerson());

        person.sayEnglish();
        person.sayFrench();
        person.sayChinese();

    }

}
