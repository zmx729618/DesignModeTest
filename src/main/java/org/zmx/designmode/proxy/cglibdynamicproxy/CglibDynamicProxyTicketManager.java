package org.zmx.designmode.proxy.cglibdynamicproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by zhangwenchao on 2017/7/12.
 */
public class CglibDynamicProxyTicketManager implements MethodInterceptor {
    private Object targetObject;//目标对象
    /**
     * 创建代理对象
     * @param targetObject
     * @return
     */
    public Object getInstance(Object targetObject) {
        this.targetObject = targetObject;
        Enhancer enhancer = new Enhancer();  // 用这个类来创建代理对象(被代理类的子类)： 并设置父类；设置回调；
        enhancer.setSuperclass(this.targetObject.getClass()); // 设置被代理类作为其父类的代理目标
        // 回调方法
        enhancer.setCallback(this);  // 设置回调--当这个代理对象的方法被调用时 回调方法intercept()会被执行
        // 创建代理对象
        return enhancer.create();
    }

    @Override
    //回调方法
    // methodProxy 代理的类的方法
    /**
     * methodProxy 会调用父类(目标对象)的被代理的方法,比如soldTicket方法等
     */
    public Object intercept(Object obj, Method method, Object[] args,
                            MethodProxy methodProxy) throws Throwable {
        Object result = null;
        checkIdentity();//前置增强
        result=methodProxy.invokeSuper(obj, args); //调用新生成的cglib的代理对象 所属的父类的被代理的方法
        log();//后置增强
        return result;
    }

    /**
     * 身份验证
     */
    public void checkIdentity(){
        System.out.println("身份验证--------------");
    }
    public void log(){
        System.out.println("日志记录--------------" );
    }


}
