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
        } finally {
            System.out.println("Executing the necessary statement");
        }
    }
}
