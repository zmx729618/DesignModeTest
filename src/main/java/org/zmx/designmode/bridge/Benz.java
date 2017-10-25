package org.zmx.designmode.bridge;

/**
 * Created by zhangwenchao on 2017/7/13.
 */
public class Benz extends Car {
    public Benz(Engine engine) {
        super(engine);
    }

    @Override
    public void install() {
        System.out.println("Benz车安装");
        this.getEngine().addEngine();
    }
}
