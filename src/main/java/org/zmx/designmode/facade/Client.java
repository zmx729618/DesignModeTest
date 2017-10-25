package org.zmx.designmode.facade;

/**
 * Created by zhangwenchao on 2017/7/13.
 */
public class Client {

    public static void main(String[] args) {
        Facade f=new Facade();
        System.out.println("客户1需要的两个子系统功能");
        f.doAB();

        System.out.println("----------------------");

        System.out.println("客户2需要的三个子系统功能");
        f.doABC();
    }

}
