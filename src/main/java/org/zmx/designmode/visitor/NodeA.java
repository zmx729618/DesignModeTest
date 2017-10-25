package org.zmx.designmode.visitor;

/**
 * Created by zhangwenchao on 2017/8/1.
 */
public class NodeA extends Node {
    /**
     * 接受操作
     */
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    /**
     * NodeA特有的方法
     */
    public String operationA() {
        return "NodeA";
    }

}
