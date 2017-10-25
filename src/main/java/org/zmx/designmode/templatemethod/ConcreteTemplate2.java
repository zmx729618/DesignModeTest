package org.zmx.designmode.templatemethod;

/**
 * Created by zhangwenchao on 2017/7/18.
 */
public class ConcreteTemplate2 extends AbstractTemplate{

    @Override
    public double accountDiscount() {
        return 0.7;
    }
    @Override
    public String  doGetClienttype(){
        return "会员客户";
    }
}
