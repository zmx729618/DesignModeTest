package org.zmx.designmode.interpret;

/**
 * Created by zhangwenchao on 2017/8/2.
 */
public class Client {

    private static Expression ex, exa, exs, exm;

    private static Context con;

    public static void main(String[] args)

    {

        con = new Context();

        // 设置变量、常量

        Variable a = new Variable();

        Variable b = new Variable();

        Constant c = new Constant(2);

        // 为变量赋值

        con.addValue(a, 10);

        con.addValue(b, 8);


        // 运算，对句子的结构由我们自己来分析，构造
        exs = new Subtract(a, b);
        exa = new Add(exs, c);
        exm = new Multiply(a, b);
        ex = new Division(exm, exa);

        System.out.println("运算结果为：" + ex.interpret(con));

    }
}