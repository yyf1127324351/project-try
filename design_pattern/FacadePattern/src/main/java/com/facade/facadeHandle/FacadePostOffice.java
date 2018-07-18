package com.facade.facadeHandle;

/**
 * 类描述：门面类
 * 创建人：yyf
 * 创建时间：2018/6/20 0020下午 03:19
 */

public class FacadePostOffice {
    private LetterProcess letterProcess = new LetterProcessImpl();

    //2.现在为了增加信的安全性，增加了队信的检查功能。
    private CheckLetter checkLetter = new CheckLetter();

    //写信，封装，投递，一体化了
    public void sendLetter(String context,String address){
        //帮你写信
        letterProcess.writeContext(context);
        //写好信封
        letterProcess.fillEnvelope(address);

        //2.检查信
        checkLetter.checkLetter(letterProcess);

        //把信放到信封中
        letterProcess.letterInotoEnvelope();
        //邮递信件
        letterProcess.sendLetter();
    }
}
