package Basics.BasicCalculatorUsingLamda;

public class Main {
    public static void main(String[] args) {
        //Mathematical Operation is the object of the interface
        MathematicalOperation addition = (a, b) -> {
            return  a + b;
        };

        MathematicalOperation subtraction = (a, b) -> {
            return a - b;
        };

        MathematicalOperation multiply = (a, b) -> {
            return a * b;
        };

        Integer add = addition.operate(20, 50);
        System.out.println(add);

        System.out.println(subtraction.operate(100, 50));
        System.out.println(multiply.operate(200, 300));
    }
}
