package org.zmx.designmode.builder;

/**
 * Created by zhangwenchao on 2017/6/22.
 */
public class MainTest {

    public static  void main(String[] agrs){

        Builder builder = new ConcreteBuilder(); //
        Director director = new Director(builder);
        director.construct();
        Product product = builder.retrieveResult();
        System.out.println(product.getPart1());
        System.out.println(product.getPart2());



    }
}
