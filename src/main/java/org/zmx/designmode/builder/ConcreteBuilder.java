package org.zmx.designmode.builder;

/**
 * Created by zhangwenchao on 2017/6/22.
 * 具体建造者
 */
public class ConcreteBuilder implements Builder {
    private Product product = new Product();
    @Override
    public void buildPart1() {
        //构建产品的第一个零件
        product.setPart1("编号：007");

    }

    @Override
    public void buildPart2() {
        //构建产品的第二个零件
        product.setPart2("名称：暗黑者");

    }

    @Override
    public Product retrieveResult() {
        return product;
    }
}
