package org.zmx.designmode.proxy;

/**
 * Created by zhangwenchao on 2017/7/12.
 */
public class CheckIdentityProxy implements TicketManager{

    private TicketManager ticketManager;//目标对象的引用

    public CheckIdentityProxy(TicketManager ticketManager) {
        this.ticketManager = ticketManager;
    }

    @Override
    public void soldTicket() {
        checkIdentity();//前置增强
        ticketManager.soldTicket();
    }

    @Override
    public void changeTicket() {
        checkIdentity();
        ticketManager.changeTicket();
    }

    @Override
    public void returnTicket() {
        checkIdentity();
        ticketManager.changeTicket();
    }
    /**
     * 身份验证
     */
    public void checkIdentity(){
        System.out.println("身份验证---------");
    }





}
