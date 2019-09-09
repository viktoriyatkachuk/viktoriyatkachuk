/*
1. В пакете lesson03 создать класс Fibonacci с методом printFibonacciNumbers, который выводит
числа ряда Фибоначчи (0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, ….) в консоль.
Предусмотреть, чтоб количество выводимых чисел было параметром этого метода.
2. Вызвать метод в главном методе (main) и проверить его работу для разного количества чисел:
printFibonacciNumbers(-1) -> "Please enter a positive number more than 0";
printFibonacciNumbers(0) -> "Please enter a positive number more than 0";
printFibonacciNumbers(1) -> 0;
printFibonacciNumbers(4) -> 0, 1, 1, 2;
printFibonacciNumbers(7) -> 0, 1, 1, 2, 3, 5, 8/

*/


package lesson03.Fibonacci;

import java.util.Arrays;

public class Fibonacci {

    public String printFibonacciNumbers (int number) {

        // validate correct number - different or bigger hen zero
        if (number <= 0) {
            return  ("Please enter a positive number more than 0 and not negative");
        } else if (number == 1) {
            return  ("0");
        }


        // calculate fibonacci numbers
        int[] a = new int[number+2];
        a[0] = 1;
        a[1] = 1;

        System.out.print ("0 ");
        for(int i = 0; i < a.length; i++) {
            if(i > 2) {
                a[i] = a[i - 2] + a[i - 1];
                System.out.print(a[i] + " ");
            }

        } return "Done!";


    }
}

