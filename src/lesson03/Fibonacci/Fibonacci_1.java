package lesson03.Fibonacci;

public class Fibonacci_1 {
       public static void main (String[] args) {
        Fibonacci OtherObject=new Fibonacci ();
           System.out.println (OtherObject.printFibonacciNumbers (-1));
           System.out.println (OtherObject.printFibonacciNumbers (0) );
           System.out.println (OtherObject.printFibonacciNumbers (1) );
           System.out.println (OtherObject.printFibonacciNumbers (4) );
           System.out.println (OtherObject.printFibonacciNumbers (7) );
    }
}
