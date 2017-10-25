package org.zmx.designmode.interpret;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhangwenchao on 2017/8/2.
 */
public class Context {

    private Map<Variable,Integer> valueMap = new HashMap<Variable,Integer>();

    public void addValue(Variable x , int y)
    {
        valueMap.put(x , y);
    }

    public int LookupValue(Variable x)

    {
        int i = valueMap.get(x);
        return i ;
    }
}
