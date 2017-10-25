package org.zmx.designmode.interpret;

/**
 * Created by zhangwenchao on 2017/8/2.
 */
public class Constant extends Expression {

    private int i;

    public Constant(int i){
        this.i = i;
    }

    public int interpret(Context con){
        return i;
    }

}
