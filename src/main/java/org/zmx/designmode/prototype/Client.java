package org.zmx.designmode.prototype;

/**
 * Created by zhangwenchao on 2017/7/10.
 */
public class Client {

    public static void main(String[] args) {
        Person1 p1=new Person1();
        p1.setName("汤高");
        p1.setAge(20);

//      Person p2=p1;//地址相同  只是把引用给了p2 指向同一个地址
//      System.out.println(p1==p2);//true
        Person1 p2=p1.clone();
        //拷贝  地址不同了 指向不同的地址
        System.out.println("前后地址相同吗:  "+(p2==p1));
        System.out.println("输出p1:" +p1.getName()+"\t"+p1.getAge());
        System.out.println("输出p2:" +p2.getName()+"\t"+p2.getAge());

        //修改拷贝后的对象的属性值
        p2.setName("周思远");
        p2.setAge(19);
        System.out.println("输出p1:" +p1.getName()+"\t"+p1.getAge());
        System.out.println("输出p2:" +p2.getName()+"\t"+p2.getAge());

    }

}
