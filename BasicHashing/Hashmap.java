package BasicHashing;

import java.util.HashMap;
import java.util.Scanner;

public class Hashmap {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        HashMap<Integer, Integer> map = new HashMap<>();
        System.out.print("Enter " + n + " numbers : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        System.out.print("Enter the query number : ");
        int q = sc.nextInt();

        while (q-- > 0) {
            int num = sc.nextInt();
            System.out.println(map.getOrDefault(num, 0));
        }
    }
}
