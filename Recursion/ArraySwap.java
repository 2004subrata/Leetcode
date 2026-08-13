package Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySwap {
    public static void swap(int i, int[] arr, int n) {
        if (i >= n - i - 1)
            return;
        int temp = arr[i];
        arr[i] = arr[n - i - 1];
        arr[n - i - 1] = temp;
        i++;
        n--;
        swap(i, arr, n);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.print("Enter " + n + " numbers : ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Oroginal Array : " + Arrays.toString(arr));
        swap(0, arr, n);
        System.out.print("Swapped Array : " + Arrays.toString(arr));
    }
}
