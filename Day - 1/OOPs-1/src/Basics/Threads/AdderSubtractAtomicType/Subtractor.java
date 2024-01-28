package Basics.Threads.AdderSubtractAtomicType;

import Basics.Threads.AdderSubtractAtomicType.*;

public class Subtractor implements Runnable{
    Count count;
    public Subtractor(Count count1){
        this.count = count1;
    }
    @Override
    public void run(){
        for(int i = 1; i <= 10000; i++){
            count.value.addAndGet(-i);
        }
    }
}
