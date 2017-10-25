package org.zmx.designmode.proxy;

/**
 * Created by zhangwenchao on 2017/7/12.
 */
public class TicketManagerImpl implements TicketManager{

    @Override
    public void soldTicket() {
        System.out.println("售票");
    }

    @Override
    public void changeTicket(){

        System.out.println("改签");
    }

    @Override
    public void returnTicket() {
        System.out.println("退票");
    }
}
