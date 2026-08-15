package BasicHashing;

import java.util.Scanner;

public class Hashing {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Read the size of the array
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        // Create an array of n size and Read the elements from the user
        int[] arr = new int[n];
        System.out.print("Enter " + n + " numbers : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Hash array to store the frequency
        // Size 12 means number should be in range 0-11
        int[] hash = new int[13];
        for (int i = 0; i < n; i++) {
            hash[arr[i]] += 1;
        }

        int q;
        System.out.print("Enter how much number you want to count : ");
        q = sc.nextInt();

        while (q-- > 0) {
            int number;
            number = sc.nextInt();

            // fetched
            System.out.println(hash[number]);
        }
    }
}
