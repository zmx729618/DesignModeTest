package org.zmx.designmode.strategy;

/**
 * Created by zhangwenchao on 2017/7/14.
 */
/**
 *  具体策略角色2：
 *      开绿灯 求吴国太开个绿灯。
 * @author Administrator
 *
 */
public class GivenGreenLight implements IStrategy {
    @Override
    public void operate() {
        System.out.println("求吴国太开个绿灯，放行！");

    }

}
