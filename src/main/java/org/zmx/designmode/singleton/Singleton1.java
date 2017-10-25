package org.zmx.designmode.singleton;

/**
 * Created by zhangwenchao on 2017/6/22.
 * 懒汉式
 */
public class Singleton1 {

    // 构造方法私有化
    private Singleton1() {
    }
    //静态变量
    private static Singleton1 instance = null;

    // 静态工厂方法
    public static synchronized  Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }



    public  static  void main(String[] args){

        Singleton1 instance  = Singleton1.getInstance();

        System.out.println(instance);

    }
}
