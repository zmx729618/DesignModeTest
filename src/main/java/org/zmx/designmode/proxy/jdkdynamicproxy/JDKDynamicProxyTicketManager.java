package org.zmx.designmode.proxy.jdkdynamicproxy;

import org.zmx.designmode.proxy.TicketManager;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by zhangwenchao on 2017/7/12.
 */
public class JDKDynamicProxyTicketManager implements InvocationHandler {

    private TicketManager targetObject;

    /**
     * 反射，这样你可以在不知道具体的类的情况下，根据配置的参数去调用一个类的方法。在灵活编程的时候非常有用。
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        // 检查
        checkIdentity();
        Object ret;
        try {
            // 调用目标方法
            ret = method.invoke(targetObject, args);
            // 执行成功，打印成功信息
            log();
        } catch (Exception e) {
            e.printStackTrace();
            // 失败时，打印失败信息
            System.out.println("error-->>" + method.getName());
            throw e;
        }
        return ret;
    }




    /**
     * 身份验证
     */
    private void checkIdentity(){
        System.out.println("身份验证--------------");
    }
    private void log(){
        System.out.println("日志记录--------------");
    }


    /**
     * 目标的初始化方法，根据目标生成代理类
     * @param targetObject  被代理对象
     * @return 代理对象
     */

    Object newProxyInstance(TicketManager targetObject) {
        this.targetObject = targetObject;
        // 第一个参数，目标对象 的装载器
        // 第二个参数，目标接口已实现的所有接口，而这些是动态代理类要实现的接口列表
        // 第三个参数， 调用实现了InvocationHandler的对象生成动态代理实例，当你一调用代理，代理就会调用InvocationHandler的invoke方法
        return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(),
                targetObject.getClass().getInterfaces(), this);
    }


}
