package com.factory.factoryHandle;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

/**
 * 类描述：
 * 创建人：yyf
 * 创建时间：2018/6/26 0026上午 09:47
 */

public class ClassTool {

    public static List<Class> getAllClassByInterface(Class c) {
        List<Class> returnClassList = new ArrayList<Class>(); //返回结果
        //判断是不是接口，如果是接口则处理，如果不是接口，则不处理
        if (c.isInterface()){
            String packageName = c.getPackage().getName(); //获取当前包名
            
            List<Class> allClass =  getAllClasses(packageName);
            //判断是否是同一个接口
            for(int i=0;i<allClass.size();i++){
                if(c.isAssignableFrom(allClass.get(i))){ //判断是不是一个接口
                    if(!c.equals(allClass.get(i))){ //本身不加进去
                        returnClassList.add(allClass.get(i));
                    }
                }
            }
        }
        return returnClassList;

    }

    private static List<Class> getAllClasses(String packageName){
        List<Class> allClass = new ArrayList<>();
        // 返回对当前正在执行的线程对象的引用。
        // 返回该线程的上下文 ClassLoader。
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        String path = packageName.replace(".","/");
        try {
            // getResources:查找所有给定名称的资源
            // 获取jar包中的实现类:Enumeration<URL> enumeration = classLoader.getResources(path);
            Enumeration<URL> enumeration = classLoader.getResources(path);
            List<File> fileList = new ArrayList<File>();
            while (enumeration.hasMoreElements()){
                URL url = enumeration.nextElement();
                // 获取此 URL 的文件名
                fileList.add(new File(url.getFile()));
            }
            //如果file是文件夹，则递归调用findClass方法，或者文件夹下的类 如果file本身是类文件，则加入list中进行保存，并返回
            for (File file : fileList){
                allClass.addAll(findClasses(file, packageName));
            }
        }catch (IOException e){
            e.printStackTrace();
        }



        return allClass;
    }

    private static ArrayList<Class> findClasses(File file, String packageName) {
        ArrayList<Class> classes = new ArrayList<>();
        if (!file.exists()) {
            return classes;
        }
        File[] files = file.listFiles();
        for (File file1 : files){
            if (file1.isDirectory()){
                // 添加断言用于判断
                assert !file1.getName().contains(".");
                classes.addAll(findClasses(file1,packageName+"."+file1.getName()));
            }else if (file1.getName().endsWith(".class")){
                try {
                    // 保存的类文件不需要后缀.class
                    classes.add(Class.forName(packageName + "." + file1.getName().substring(0, file1.getName().length() - 6)));
                }catch (ClassNotFoundException e){
                    e.printStackTrace();
                }
            }
        }
        return classes;
    }
}
