package org.zmx.designmode.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangwenchao on 2017/7/13.
 */
public class Composite extends Component{

    List<Component> childList=new ArrayList<Component>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public boolean add(Component c) {
        childList.add(c);
        return true;
    }

    @Override
    public boolean remove(Component c) {
        childList.remove(c);
        return true;

    }

    @Override
    public void foreach() {

        System.out.println("节点名:"+this.getName());
        for(Component component:childList){
            System.out.print("|__");
            component.foreach();
        }

    }

}
