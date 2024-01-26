package Basics.Threads.HelloWorldThread;

public class Client {
    public static void main(String[] args) {
        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();
        Thread thread = new Thread(helloWorldPrinter);
        thread.start();
    }
}
