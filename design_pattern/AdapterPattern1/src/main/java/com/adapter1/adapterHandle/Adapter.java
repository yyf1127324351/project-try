package com.adapter1.adapterHandle;

/**
 * 类描述：适配器类
 * 创建人：yyf
 * 创建时间：2018/6/19 0019上午 11:42
 */
//类适配器,因为继承了Person,而Java中只能单继承,所以这个适配器只为person这一个类服务
//这个适配器就让person类在不修改源码的基础上能实现目标接口所指定的方法

public class Adapter extends AdapteePerson implements ITagerPerson {

    @Override
    public void sayEnglish() {
        System.out.println("say   english ---");
    }

    @Override
    public void sayFrench() {
        System.out.println("say   french ---");
    }

    @Override
    public String getPhone() {
        String phone =  super.getNumber();
        return phone;
    }

}
