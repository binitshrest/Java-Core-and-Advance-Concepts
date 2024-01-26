package Basics.Threads.NumberPrinterUsingPool;

import Basics.Threads.NumberPrinterThreads.NumberPrinter;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {

        ExecutorService executorServiceCached = Executors.newCachedThreadPool();
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for(int i = 1; i <= 100; i++){
            if(i == 54){
                System.out.println("Waiting");
            }
            NumberPrinter numberPrinter = new NumberPrinter(i);
            executorServiceCached.execute(numberPrinter);

        }
    }
}
