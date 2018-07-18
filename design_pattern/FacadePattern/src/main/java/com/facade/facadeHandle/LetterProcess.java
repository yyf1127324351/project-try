package com.facade.facadeHandle;

/**
 * 类描述：
 * 创建人：yyf
 * 创建时间：2018/6/20 0020下午 02:55
 */

public interface LetterProcess  {
    //首先写信内容
    public void writeContext(String context);
    //其次写信封
    public void fillEnvelope(String address);
    //把新放到信封中
    public void letterInotoEnvelope();
    //把信邮寄
    public void sendLetter();
}
