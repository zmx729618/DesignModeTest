package org.zmx.designmode.strategy;

/**
 * Created by zhangwenchao on 2017/7/14.
 */
/**
 * 环境(Context)角色：
 * @author Administrator
 *
 */
public class Context {
    private IStrategy strategy;
    //构造函数，要你使用哪个妙计
    public Context(IStrategy strategy){
        this.strategy = strategy;
    }

    public void operate(){
        this.strategy.operate();
    }
}
