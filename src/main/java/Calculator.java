public class Calculator {
    /*  Java class which serves as a calculator.
        Provides methods for: addition, subtraction.

        Addition(integer, integer): returns integer sum.
        Subtraction(integer, integer): returns the integer difference.
        Multiplication(integer, integer): Since the result of integer multiplication
                                          can result in integer overflow, it returns a long.
     */

    int addition(int a, int b){
        return a+b;
    }

    int subtraction(int a, int b){
        return a-b;
    }

    long multiplication(int a, int b){
        return ((long) a*b);
    }

}
