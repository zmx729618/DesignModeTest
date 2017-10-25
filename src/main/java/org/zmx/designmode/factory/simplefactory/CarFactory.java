package org.zmx.designmode.factory.simplefactory;

/**
 * Created by zhangwenchao on 2017/6/26.
 */
public class CarFactory {

    public static Car produceCar(String params) throws Exception{

        if(params.equals("benzCar")){
             return new BenzCar();

        }else if(params.equals("bmwCar")){

             return new BmwCar();
        }else{

             throw new Exception();

        }

    }
}
