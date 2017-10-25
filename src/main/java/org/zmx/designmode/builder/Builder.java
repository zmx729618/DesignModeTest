package org.zmx.designmode.builder;

/**
 * Created by zhangwenchao on 2017/6/22.
 * 建造者接口
 */
public interface Builder {
    //产品零件一建造方法
    public void buildPart1();
    //产品零件二建造方法
    public void buildPart2();
    //返回产品的方法
    public Product retrieveResult();

}
