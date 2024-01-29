package Basics.lamdasAndStreams;

public class Main {
    public static void main(String[] args) {
        //v1
        Somethingdoer somethingdoer = new Somethingdoer();
        Thread t1 = new Thread(somethingdoer);
        t1.start();
        //v2
        Runnable r = () -> {
            System.out.println("Do something -->version v2");
        };
        Thread t2 = new Thread(r);
        t2.start();

        //v3
        Thread tw = new Thread(
                () -> {
                    System.out.println("Do Something version v3");
                }
        );
        tw.start();
    }
}
