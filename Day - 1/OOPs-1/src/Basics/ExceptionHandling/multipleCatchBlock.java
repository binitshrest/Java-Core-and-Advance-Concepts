package Basics.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class multipleCatchBlock {
    public static void main(String[] args) {
        try{
            Scanner scn = new Scanner(System.in);
            int a = scn.nextInt();
            int b = scn.nextInt();
            int c = a / b;
            System.out.println("the result of c is "+ c);
        } catch(InputMismatchException inputMismatchException) {
            System.out.println("Input Mismatch Exception has occurred");
        } catch(ArithmeticException arithmeticException){
            System.out.println("Arithematic Exception has occurred");
        } catch (Exception exception){
            System.out.println("This will catch rest of the unknown exception");
        }
    }
}
