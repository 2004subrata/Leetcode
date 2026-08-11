// Write a program to calulate the sum of first 'N' numbers

package Recursion;

import java.util.Scanner;

public class SumOfFirstNNumbers {
    public static int sumOfNumbers(int n) {
        if (n == 1)
            return 1;
        int result = n + sumOfNumbers(n - 1);
        return result;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int result = sumOfNumbers(n);
        System.out.print("Sum of all digits upto " + n + " is : " + result);
    }
}
