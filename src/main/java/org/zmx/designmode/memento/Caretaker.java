package org.zmx.designmode.memento;

/**
 * Created by zhangwenchao on 2017/7/31.
 */
public class Caretaker {

    private Memento memento;

    /**
     * 备忘录的取值方法
     */
    public Memento retrieveMemento() {
        return this.memento;
    }

    /**
     * 备忘录的赋值方法
     */
    public void saveMemento(Memento memento) {
        this.memento = memento;
    }

}
