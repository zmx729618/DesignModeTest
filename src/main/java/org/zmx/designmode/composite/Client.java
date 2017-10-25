package org.zmx.designmode.composite;

/**
 * Created by zhangwenchao on 2017/7/13.
 */
public class Client {
     public static void main(String[] args){


         Component root = new Composite("根节点");


         Component child_1 = new Composite("一级子节点child_1");



         //把两个叶子节点添加到一级子节点child
         Component child_1_1 = new Leaf("一级子节点child之子节点一");
         Component child_1_2 = new Leaf("一级子节点child之子节点二");


         child_1.add(child_1_1);
         child_1.add(child_1_2);

         Component child_2 = new Composite("一级子节点child_2");

         Component child_2_1 = new Composite("二级子节点child_2_1");

         //把两个叶子节点添加到一级子节点child
         Component child_2_1_1 = new Leaf("一级子节点child之子节点一");
         Component child_2_1_2 = new Leaf("一级子节点child之子节点二");
         child_2_1.add(child_2_1_1);
         child_2_1.add(child_2_1_2);

         Component child_2_2 = new Composite("二级子节点child_2_2");

         child_2.add(child_2_1);
         child_2.add(child_2_2);

         //把两个一级子节点添加到根节点
         root.add(child_1);
         root.add(child_2);
         root.foreach();

     }

}
