package org.zmx.designmode.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangwenchao on 2017/7/21.
 */
public abstract class Subject {

    /**
     * 用来保存注册的观察者对象
     */
    private List<Observer> observerList = new ArrayList<Observer>();

    /**
     * 注册观察者对象
     * @param observer    观察者对象
     */
    public void attach(Observer observer){

        observerList.add(observer);
        System.out.println("Attached an observer");
    }

    /**
     * 删除观察者对象
     * @param observer    观察者对象
     */
    public void detach(Observer observer){

        observerList.remove(observer);
    }

    /**
     * 通知所有注册的观察者对象
     */
    public void nodifyObservers(String newState){

        for(Observer observer : observerList){
            observer.update(newState);
        }
    }
}
