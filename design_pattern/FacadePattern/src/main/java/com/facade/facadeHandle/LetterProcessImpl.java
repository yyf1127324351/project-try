package com.facade.facadeHandle;

/**
 * 类描述：
 * 创建人：yyf
 * 创建时间：2018/6/20 0020下午 03:04
 */

public class LetterProcessImpl implements LetterProcess {
    @Override
    public void writeContext(String context) {
        System.out.println("填写信的内容...." + context);
    }

    @Override
    public void fillEnvelope(String address) {
        System.out.println("填写收件人地址及姓名...." + address);
    }

    @Override
    public void letterInotoEnvelope() {
        System.out.println("把信放到信封中....");
    }

    @Override
    public void sendLetter() {
        System.out.println("邮递信件...");
    }
}
