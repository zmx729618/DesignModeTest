package org.zmx.designmode.prototype;

/**
 * Created by zhangwenchao on 2017/7/10.
 */
public class Person1  implements Cloneable{

    //基本数据类型
    private int age;
    //String引用类型
    private String name;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Person1 clone() {
        Person1 person =null;
        try {
            person = (Person1) super.clone();
            return person;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

}

