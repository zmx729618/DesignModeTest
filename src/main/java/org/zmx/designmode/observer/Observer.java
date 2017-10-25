package org.zmx.designmode.observer;

/**
 * Created by zhangwenchao on 2017/7/21.
 */
public interface Observer {
    /**
     * 更新接口
     * @param state    更新的状态
     */
    public void update(String state);
}
