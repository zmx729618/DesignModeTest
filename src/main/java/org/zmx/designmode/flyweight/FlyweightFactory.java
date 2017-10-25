package org.zmx.designmode.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhangwenchao on 2017/7/14.
 */
//享元工厂角色类
public class FlyweightFactory {

    private FlyweightFactory(){}

    private static  FlyweightFactory instance=null;

    // 静态工厂方法
    public static synchronized  FlyweightFactory getInstance() {
        if (instance == null) {
            instance = new FlyweightFactory();
        }
        return instance;
    }


    // 一个用来存所有享元对象的集合 String表示对象的键的类型 ->内蕴状态 ;Flyweight表示对象值的类型
    private Map<String, Flyweight> files = new HashMap<String, Flyweight>();

    public Flyweight factory(String intrinsicState) {
        // 先从缓存中查找对象
        Flyweight fly = files.get(intrinsicState);
        if (fly == null) {
            // 如果对象不存在则创建一个新的Flyweight对象
            fly = new ConcreteFlyweight(intrinsicState);
            // 把这个新的Flyweight对象添加到缓存中
            files.put(intrinsicState, fly);
        }
        return fly;
    }
    //得到存对象的集合的长度
    public int getFlyWeightSize() {
        return files.size();
    }

}
