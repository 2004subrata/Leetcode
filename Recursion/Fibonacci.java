package Recursion;

import java.util.Scanner;

public class Fibonacci {
    public static int fibo(int n) {
        if (n <= 1)
            return n;
        return fibo(n - 1) + fibo(n - 2);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        if (n < 0)
            throw new Error("Enter a positive number");
        int fibo = fibo(n);
        System.out.print(n + "th fibonacci number is : " + fibo);
    }
}
