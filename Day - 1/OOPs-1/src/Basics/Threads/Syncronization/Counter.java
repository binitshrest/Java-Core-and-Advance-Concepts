package Basics.Threads.Syncronization;

public class Counter {
    private int count;
    public Counter(int c){
        count = c;
    }
    public synchronized void incVal(int offset){
        count += offset;
    }
    public synchronized int getValue(){
        return count;
    }
    public synchronized void decValue(int offset){
        count -= offset;
    }
}
