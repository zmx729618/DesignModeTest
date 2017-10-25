package org.zmx.designmode.templatemethod;

/**
 * Created by zhangwenchao on 2017/7/18.
 */
public class Client {

    public static void main(String[] args) {
        AbstractTemplate c=new  ConcreteTemplate1();
        String clentType1=c.doGetClienttype();
        double money1=c.accountMoney();
        System.out.println("客户种类 ："+clentType1);
        System.out.println("需支付: "+money1);

        AbstractTemplate m=new  ConcreteTemplate2();
        String clentType2=m.doGetClienttype();
        double money2=m.accountMoney();
        System.out.println("客户种类 ："+clentType2);
        System.out.println("需支付: "+money2);
    }

}
