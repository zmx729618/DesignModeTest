package org.zmx.designmode.decorator;

/**
 * Created by zhangwenchao on 2017/7/12.
 */
public class Client {

   public  static  void main(String[] args){


       Component component = new ConcreteComponent();

       Decorator decoratorA = new ConcreteDecoratorA(component);
       Decorator decoratorB = new ConcreteDecoratorB(decoratorA);
       decoratorB.sampleOperation();

   }
}
