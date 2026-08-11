// write a program to print 1 to n.

package Recursion;

import java.util.Scanner;

public class PrintOneToN {
    public static void printOneToN(int n) {
        if (n < 1)
            return;
        printOneToN(n - 1);
        System.out.print(n + " ");
        return;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        printOneToN(n);
    }
}
