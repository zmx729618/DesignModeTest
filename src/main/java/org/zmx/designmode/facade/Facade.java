package org.zmx.designmode.facade;

/**
 * Created by zhangwenchao on 2017/7/13.
 */
public class Facade {

    private SystemA systemA;
    private SystemB systemB;
    private SystemC systemC;

    Facade(){
        systemA=new SystemA();
        systemB=new SystemB();
        systemC=new SystemC();
    }
    // 方法 满足客户端需要的功能
    public void doAB(){
        systemA.doA();
        systemB.doB();
    }
    // 方法 满足客户端需要的功能
    public void doABC(){
        systemA.doA();
        systemB.doB();
        systemC.doC();
    }



}
