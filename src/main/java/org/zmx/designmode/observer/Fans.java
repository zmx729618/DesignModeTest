package org.zmx.designmode.observer;

import java.util.Observable;

/**
 * Created by zhangwenchao on 2017/7/21.
 */
public class Fans implements java.util.Observer {

    private String articleInfo;

    @Override
    public void update(Observable observe, Object article) {
        System.out.println(">>>>>>>>>>>>>>"+observe);
        System.out.println(">>>>>>>>>>>>>>"+article);
        articleInfo=article.toString();
        System.out.println("你关注的博主更新文章了 ！文章标题为 ："+articleInfo);
    }

}
