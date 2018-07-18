package com.facade.test;

import com.facade.FacadeApplication;
import com.facade.facadeHandle.FacadePostOffice;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 类描述： 门面模式，为了让使用者方便调用，对业务逻辑类进行封装。增加了一个门面，当client调用时，直接调用门面的方法就可以了，不用了解具体的实现方法以及业务逻辑
 *         如果新增对信的操作，比如 核查信，直接在门面类中处理即可
 * 创建人：yyf
 * 创建时间：2018/6/20 0020下午 01:57
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = FacadeApplication.class)
public class TestFacadePattern {

    @Test
    private void test(){
        //创建一个门面邮局的实例
        FacadePostOffice  facadePostOffice = new FacadePostOffice();
        String context = "信的内容";
        String address = "信的地址";
        //你只要把信的内容和收信人地址给他，他会帮你完成一系列的工作；
        facadePostOffice.sendLetter(context,address);
    }
}
