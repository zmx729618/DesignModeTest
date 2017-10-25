package org.zmx.designmode.proxy.cglibdynamicproxy;

import org.zmx.designmode.proxy.TicketManager;
import org.zmx.designmode.proxy.TicketManagerImpl;

/**
 * Created by zhangwenchao on 2017/7/12.
 */
public class Client {

    public static void main(String[] args) {
        CglibDynamicProxyTicketManager cglibdynamicProxyTicketManager=new CglibDynamicProxyTicketManager();
        //生成代理对象
        TicketManager tm=(TicketManager) cglibdynamicProxyTicketManager.getInstance(new TicketManagerImpl());

        tm.soldTicket();//当调用代理对象的被代理对象的方法时  会自动回调 代理类中的Intercept()方法
        tm.changeTicket();
        tm.returnTicket();
    }
}
