package org.zmx.designmode.visitor;

/**
 * Created by zhangwenchao on 2017/8/1.
 */
public class VisitorB implements Visitor {

    /**
     * 对应于NodeA的访问操作
     */
    @Override
    public void visit(NodeA node) {
        System.out.println(node.operationA());
    }

    /**
     * 对应于NodeB的访问操作
     */
    @Override
    public void visit(NodeB node) {
        System.out.println(node.operationB());
    }

}
