package org.zmx.designmode.mediator.demo;

/**
 * Created by zhangwenchao on 2017/8/1.
 */
class ColleagueB extends AbstractColleague {

    @Override
    public void setNumber(int number, AbstractMediator am) {
        this.number = number;
        am.BaffectA();
    }
}

