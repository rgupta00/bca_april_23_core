package calclient;

import calapi.Cal;
import calapiinternal.CalInternal;

public class Main {
    public static void main(String[] args) {
        Cal cal=new Cal();
       // CalInternal calInternal=new CalInternal(); it should not be allowd
        System.out.println(cal.add(3,5));
    }
}
