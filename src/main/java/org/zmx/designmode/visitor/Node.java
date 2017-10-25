package org.zmx.designmode.visitor;

/**
 * Created by zhangwenchao on 2017/8/1.
 */
public abstract class Node {

    /**
     * 接受操作
     */
    public abstract void accept(Visitor visitor);

}
