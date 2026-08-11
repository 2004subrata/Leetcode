// Write a program to calculate the factorial of 'N' numbers.

package Recursion;

import java.util.Scanner;

public class Factorial {
    public static int factorial(int n) {
        if(n==1) return 1;
        int result = n * factorial(n-1);
        return result; 
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int result = factorial(n);
        System.out.print("Factorial of " + n + " is : " + result);
    }
}
