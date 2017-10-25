package org.zmx.designmode.observer;

/**
 * Created by zhangwenchao on 2017/7/21.
 */
public class MainTest {


    public static void main(String[] args) {
        Article a=new Article();
        Fans obsever=new Fans();
        Fans obsever1=new Fans();
        a.addObserver(obsever);
        a.addObserver(obsever1);
        a.setArticle("我写了一篇博客");
    }
}
