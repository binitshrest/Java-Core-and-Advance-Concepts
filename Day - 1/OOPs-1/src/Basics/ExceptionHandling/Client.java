package Basics.ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Client {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("abc"); //exception has happend here so go to catch block
            System.out.println("Try another thing"); //this line wont execute
        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
            System.out.println("An exception has happened in reading");
            System.out.println("Doing more Stuff");
            return;
        } finally {
            boolean ans = fun();
            System.out.println("Ans from fun is "+ ans);
            System.out.println("Executing the necessary statement");
        }
    }
    static boolean fun(){
        try{
            return true; //intially ans = true will get stored
        } finally {
            System.out.println("Printing fun");
            return false; //after coming to finally block ans is overrided to false
        }
    }
}
