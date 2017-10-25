package org.zmx.designmode.composite;

/**
 * Created by zhangwenchao on 2017/7/13.
 */
public class Leaf extends Component{
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void foreach() {
        System.out.print("___");
        System.out.println("节点名:"+this.getName());
    }

    @Override
    public boolean add(Component c) {
        return false;
    }

    @Override
    public boolean remove(Component c) {
        return false;
    }
}
