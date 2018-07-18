package com.proxy.proxyHandle;

/**
 * 类描述：媒婆代理类，代理潘金莲传话
 * 创建人：yyf
 * 创建时间：2018/6/11 0011下午 04:57
 */

public class WangPoProxy implements WomanInterface{
    private WomanInterface womanInterface;

    //默认是潘金莲的代理
    public WangPoProxy(){
        this.womanInterface = new PanJinLian();
    }
    //也可以作为其他WomanInterface的代理
    public WangPoProxy(WomanInterface womanInterface) {
        this.womanInterface = womanInterface;
    }

    @Override
    public void makeEyesWithMan() {
        this.womanInterface.makeEyesWithMan();
    }

    @Override
    public void happyWihMan() {
        this.womanInterface.happyWihMan();
    }
}
