package org.zmx.designmode.prototype;

/**
 * Created by zhangwenchao on 2017/7/10.
 */
public class School {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
