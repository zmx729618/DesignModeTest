package org.zmx.designmode.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangwenchao on 2017/7/10.
 */
public class Client2 {
    public static void main(String[] args) {
        Person2 p1=new Person2();

        List<String> friends=new ArrayList<String>();
        friends.add("汤小高");
        friends.add("周小思");
        p1.setFriends(friends);

        School school=new School();
        school.setName("清华");
        p1.setSchool(school);

        Person2 p2=p1.clone();
        System.out.println(p1.getFriends());
        System.out.println(p1.getSchool());
        System.out.println(p2.getFriends());
        System.out.println(p2.getSchool());

        friends.add("TSY");
        p1.setFriends(friends);

        School school2=new School();
        school2.setName("北大");
        p1.setSchool(school2);
        System.out.println(p1.getFriends());
        System.out.println(p1.getSchool());
        System.out.println(p2.getFriends());
        System.out.println(p2.getSchool());




    }
}
