package org.zmx.designmode.templatemethod;

/**
 * Created by zhangwenchao on 2017/7/18.
 */
public class ConcreteTemplate1 extends AbstractTemplate{
    @Override
    public double accountDiscount() {
        return 1.0;
    }
    @Override
    public String  doGetClienttype(){
        return "普通客户";
    }


}
