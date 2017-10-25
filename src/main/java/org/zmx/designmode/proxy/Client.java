package org.zmx.designmode.proxy;

/**
 * Created by zhangwenchao on 2017/7/12.
 */
public class Client {

    public static void main(String[] args) {
        //装饰模式   new TicketManagerImpl()  真实的目标对象

        TicketManager tm=new LogProxy(new CheckIdentityProxy(new TicketManagerImpl()));
        tm.soldTicket();
        tm.changeTicket();
        tm.returnTicket();
    }

}
