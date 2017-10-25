package org.zmx.designmode.state;

/**
 * Created by zhangwenchao on 2017/7/31.
 */
public interface State {

    /**
     * 状态对应的处理
     */
    public void handle(String sampleParameter);

}
