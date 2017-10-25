package org.zmx.designmode.proxy;

/**
 * Created by zhangwenchao on 2017/7/12.
 */
public interface TicketManager {

    /**
     * 售票
     */
    public  void  soldTicket();
    /**
     * 改签
     */
    public void changeTicket();
    /**
     * 退票
     */
    public void returnTicket();

}
