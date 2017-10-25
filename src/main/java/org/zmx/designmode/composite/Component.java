package org.zmx.designmode.composite;

/**
 * Created by zhangwenchao on 2017/7/13.
 */
public abstract class Component {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Component(String name){
        this.name = name;
    }

    public abstract boolean add(Component c);

    public abstract boolean remove(Component c);

    public abstract void foreach();
}
