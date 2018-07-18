package com.factory.factoryHandle;

import java.util.List;
import java.util.Random;

/**
 * 类描述：工厂类
 * 创建人：yyf
 * 创建时间：2018/6/21 0021下午 01:48
 */

public class HumanFactory {
    //生成指定类型的人
    public static  Human createHuman(Class c){
        Human human = null;
        try {
            human = (Human) Class.forName(c.getName()).newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        return  human;
    }

    //随机生成人
    public static Human createHuman(){
        Human human = null; //定义一个类型的人类
        //首先获取有多少个Human的实现类，即有多少种人类
//        List<Class<?>> concreteHumanList = ClassUtils.getAllInterfaces(YellowHuman.class);

        List<Class> concreteHumanList = ClassTool.getAllClassByInterface(Human.class);

        Random random = new Random();
        int rand = random.nextInt(concreteHumanList.size());
        human = createHuman(concreteHumanList.get(rand));
        return human;

    }
}
