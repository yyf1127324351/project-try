package com.adapter2.adapterHandle;

/**
 * 类描述：适配器类
 * 创建人：yyf
 * 创建时间：2018/6/19 0019上午 11:42
 */
//* 对象适配器,与类适配器不同的是:对象适配器可以适配多个源到目标

public class Adapter implements ITagerPerson {

    private AdapteePerson adapteePerson;

    public Adapter(AdapteePerson adapteePerson){
        this.adapteePerson = adapteePerson;
    }

    @Override
    public void sayEnglish() {
        System.out.println("say   english ---");
    }

    @Override
    public void sayFrench() {
        System.out.println("say   french ---");
    }

    @Override
    public void sayChinese() {
        this.adapteePerson.sayChinese();
    }
}
