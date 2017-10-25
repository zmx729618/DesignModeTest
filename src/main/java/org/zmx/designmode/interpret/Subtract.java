package org.zmx.designmode.interpret;

/**
 * Created by zhangwenchao on 2017/8/2.
 */
public class Subtract extends Expression {

    private Expression left, right;

    public Subtract(Expression left, Expression right)

    {

        this.left = left;

        this.right = right;

    }


    public int interpret(Context con)

    {

        return left.interpret(con) - right.interpret(con);

    }

}
