package calapi;

import calapiinternal.CalInternal;

public class Cal {
    private CalInternal calInternal=new CalInternal();

    public int add(int a, int b){
        return  calInternal.addInternalLogic(a,b);
    }
}
