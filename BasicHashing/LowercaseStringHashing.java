package BasicHashing;

import java.util.Scanner;

public class LowercaseStringHashing {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string of a-z : ");
        String s = sc.nextLine();

        int[] hash = new int[26];
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i) - 'a'] += 1;
        }

        System.out.print("Enter the query number : ");
        int q = sc.nextInt();

        while (q-- > 0) {
            char c = sc.next().charAt(0);
            System.out.println(hash[c - 'a']);
        }
    }
}
