package com;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Print the value of positive integer, which is n!");
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        int factorialNumber = 1;
        int factorial = 1;
        while (factorial<inputNumber){
            factorialNumber++;
            factorial *=factorialNumber;
        }
        System.out.println("The value of n = " + factorialNumber);
         scanner.close();
    }
   
}
