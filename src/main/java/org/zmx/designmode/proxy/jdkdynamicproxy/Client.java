package org.zmx.designmode.proxy.jdkdynamicproxy;

import org.zmx.designmode.proxy.TicketManager;
import org.zmx.designmode.proxy.TicketManagerImpl;

/**
 * Created by zhangwenchao on 2017/7/12.
 */
public class Client {

    public static void main(String[] args) {
        JDKDynamicProxyTicketManager dynamicProxyTicketManager=new JDKDynamicProxyTicketManager();
        TicketManager tm=(TicketManager) dynamicProxyTicketManager.newProxyInstance(new TicketManagerImpl());

        tm.soldTicket();
        tm.changeTicket();
        tm.returnTicket();
    }

}
