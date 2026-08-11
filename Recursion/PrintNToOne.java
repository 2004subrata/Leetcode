// write a program to print N to 1.
package Recursion;

import java.util.Scanner;

public class PrintNToOne {
    public static void printNToOne(int n) {
        if (n < 1)
            return;
        System.out.print(n + " ");
        printNToOne(n - 1);
        return;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        printNToOne(n);
    }
}
