// Write a program to print "Subrata" n times.
package Recursion;

import java.util.Scanner;

public class PrintNtimes {

    public static void printNtimes(int n) {
        if (n == 0)
            return;
        printNtimes(n - 1);
        System.out.println(n + " Subrata ");
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        printNtimes(n);
    }
}
