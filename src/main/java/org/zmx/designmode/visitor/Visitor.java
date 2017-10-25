package org.zmx.designmode.visitor;

/**
 * Created by zhangwenchao on 2017/8/1.
 */
public interface Visitor {

    /**
     * 对应于NodeA的访问操作
     */
    public void visit(NodeA node);

    /**
     * 对应于NodeB的访问操作
     */
    public void visit(NodeB node);

}
