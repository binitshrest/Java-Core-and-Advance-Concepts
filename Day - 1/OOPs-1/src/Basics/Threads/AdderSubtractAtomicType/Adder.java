package Basics.Threads.AdderSubtractAtomicType;

import Basics.Threads.AdderSubtractAtomicType.*;

public class Adder implements Runnable{
    Count count;
    public Adder(Count count1){
        count = count1;
    }

    @Override
    public void run(){
        for(int i = 1; i <= 10000; i++){
            count.value.addAndGet(i);
        }
    }
}
