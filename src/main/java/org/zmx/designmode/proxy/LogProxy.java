package org.zmx.designmode.proxy;

/**
 * Created by zhangwenchao on 2017/7/12.
 */
public class LogProxy implements TicketManager{

    private TicketManager ticketManager;//目标类的引用
    public LogProxy(TicketManager ticketManager){
        this.ticketManager=ticketManager;
    }
    @Override
    public void soldTicket() {
        ticketManager.soldTicket();
        log();//后置增强
    }

    @Override
    public void changeTicket() {
        ticketManager.changeTicket();
        log();
    }

    @Override
    public void returnTicket() {
        ticketManager.returnTicket();
        log();

    }
    //增强
    private void log() {
        System.out.println("日志----------");

    }

}
