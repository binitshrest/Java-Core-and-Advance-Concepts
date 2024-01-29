package Basics.lamdasAndStreams2;

import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Value v = new Value();
        Lock l = new ReentrantLock();

        ExecutorService es = Executors.newCachedThreadPool();

        Callable<Void> adderLamda = () -> {
            for(int i = 1; i <= 5000; ++i){
                l.lock();
                v.value += i;
                l.unlock();
            }
            return null;
        };

        //1. Create a class AnnonymousSubtractorlambda
        //2. It will implement the interface Callable<Void>
        //3. It will pass all variables being shared with the current scope of the class
        //4. it will copy the code inside lambda body into the interface method of that
        Callable<Void> subtractorLambda = () -> {
            for(int i = 1; i <= 5000; i++){
                l.lock();
                v.value -= i;
                l.unlock();
            }
            return null;
        };

        Future<Void> adderFuture = es.submit(adderLamda);
        Future<Void> subtractorFuture = es.submit(subtractorLambda);

        adderFuture.get();
        subtractorFuture.get();
    }
}
