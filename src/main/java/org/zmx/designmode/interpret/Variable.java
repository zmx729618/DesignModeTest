package org.zmx.designmode.interpret;

/**
 * Created by zhangwenchao on 2017/8/2.
 */
public class Variable extends Expression{

    public int interpret(Context con){
        // this为调用interpret方法的Variable对象
        return con.LookupValue(this);
    }

}
