package org.zmx.designmode.observer;

import java.util.Observable;

/**
 * Created by zhangwenchao on 2017/7/21.
 */
public class Article extends Observable {

    private String article;

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
        System.out.println("文章标题为："+article);
        //状态为状态改变，通知各个观察者
        setChanged();
        notifyObservers(article);
    }

}
