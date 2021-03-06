package com.adapter2.adapterHandle;

/**
 * 类描述：
 * 创建人：yyf
 * 创建时间：2018/6/19 0019上午 11:15
 */

public class TargetPerson implements ITagerPerson {
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void sayEnglish() {
        System.out.println("say English");
    }

    @Override
    public void sayFrench() {
        System.out.println("say French");
    }

    @Override
    public void sayChinese() {
        System.out.println("say Chinese");
    }
}
