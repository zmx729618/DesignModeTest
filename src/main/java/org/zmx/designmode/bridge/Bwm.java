package org.zmx.designmode.bridge;

/**
 * Created by zhangwenchao on 2017/7/13.
 */
public class Bwm extends Car {

    public Bwm(Engine engine) {
        super(engine);
    }
    @Override
    public void install() {
        System.out.println("Bwm车安装");
        this.getEngine().addEngine();
    }
}
