package com.adapter1.adapterHandle;

/**
 * 类描述：被适配者（Adaptee）
 * 创建人：yyf
 * 创建时间：2018/6/13 0013上午 11:33
 */

public class AdapteePerson {

    private String id;
    private String name;

    private String number = "1234567";

    public void sayChinese(){
        System.out.println("AdapteePerson say Chinese");
    }

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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
