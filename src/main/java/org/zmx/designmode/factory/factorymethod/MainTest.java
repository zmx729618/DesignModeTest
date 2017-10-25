package org.zmx.designmode.factory.factorymethod;

/**
 * Created by zhangwenchao on 2017/6/26.
 */
public class MainTest {

     public static void main(String[] args){

         AbstractCarFactory carFarctory = new BenzCarFactory();
         Car benzCar =  carFarctory.ProduceCar();
         benzCar.drive();


         carFarctory = new BmwCarFactory();
         Car BmwCar =  carFarctory.ProduceCar();
         BmwCar.drive();

     }

}
