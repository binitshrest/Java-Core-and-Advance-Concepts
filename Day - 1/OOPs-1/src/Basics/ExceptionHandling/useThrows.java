package Basics.ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class useThrows {
    public static void main(String[] args) {
        try{
            func();
        } catch(FileNotFoundException e){
            System.out.println("Exception is handled");
        }
    }
    public static void func() throws FileNotFoundException {
        FileReader fr = new FileReader("abc");
    }
}
