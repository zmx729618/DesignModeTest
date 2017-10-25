package org.zmx.designmode.templatemethod;

/**
 * Created by zhangwenchao on 2017/7/18.
 */
public abstract class AbstractTemplate {


    /**
     * 模板方法  加上final 确保不会被子类修改
     * @return 返回 计算的价钱
     */
    public final double accountMoney(){
        double oldPrice=oldPrice(10000);//假设该商品原价10000
        double discount=accountDiscount();
        return oldPrice*discount;
    }

    /**
     * 基本方法(钩子方法)留给子类实现
     * 得到客户类型
     */
    protected String  doGetClienttype(){
        return null;
    }


    /**
     * 基本方法(抽象方法)留给子类实现
     * 计算折扣  不同类型的客户折扣不同
     */
    protected abstract double accountDiscount();



    /**
     * 基本方法(具体方法)，已经实现
     * 计算原价
     */
    private double oldPrice(double price){
        return price;
    }



}
