package org.zmx.designmode.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangwenchao on 2017/7/10.
 */
public class Person2  implements Cloneable{

    //基本数据类型
    private int age;
    //String引用类型
    private String name;
    //引用类型
    private List<String> friends=new ArrayList<String>();
    //对象
    private School school;

    public School getSchool() {
        return school;
    }
    public void setSchool(School school) {
        this.school = school;
    }
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

    public List<String> getFriends() {
        return friends;
    }
    public void setFriends(List<String> friends) {
        this.friends = friends;
    }


    //修改后的clone方法
    @Override
    public Person2 clone() {
        try {
            Person2 person = (Person2) super.clone();
            if(this.getFriends()!=null){
                List<String> friends=new ArrayList<String>();
                for(String friend:this.getFriends()){
                    friends.add(friend);
                }
                person.setFriends(friends);
            }

            if(this.getSchool()!=null){
                School school=new School();
                school.setName(this.getSchool().getName());
                person.setSchool(school);

            }
            return person;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }


}




