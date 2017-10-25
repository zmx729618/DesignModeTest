package org.zmx.designmode.adapter;

/**
 * Created by zhangwenchao on 2017/7/11.
 */
public class Client {

    public static void main(String[] args) {
        Target adapter = new Adapter();
        //通过适配器调用特殊功能
        adapter.request();
    }
}
