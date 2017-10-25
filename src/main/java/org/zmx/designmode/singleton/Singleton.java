package org.zmx.designmode.singleton;

/**
 * Created by zhangwenchao on 2017/6/22.
 * 双重检查
 */
public class Singleton {

    private Singleton(){

    }

    private volatile static Singleton instance =null;

    public static Singleton getInstance(){

        if(instance ==null){

            synchronized (Singleton.class){
                if(instance ==null){
                    instance = new Singleton();
                }
            }

        }

        return instance;
    }




}
