package com.adapter2.adapterHandle;

/**
 * 类描述：目标接口   目标要求 被适配者 可以说英语,法语,中文.但是现在的被适配者仅仅可以说中文
 * 创建人：yyf
 * 创建时间：2018/6/19 0019上午 11:33
 */

public interface ITagerPerson {
    public void sayEnglish();
    public void sayFrench();
    public void sayChinese();
}
