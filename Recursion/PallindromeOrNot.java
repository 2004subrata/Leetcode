package Recursion;

import java.util.Scanner;

public class PallindromeOrNot {
    public static boolean pallindromeOrNot(int i, String str) {
        if (i >= str.length() / 2)
            return true;
        if (str.charAt(i) != str.charAt(str.length() - i - 1))
            return false;
        return pallindromeOrNot(i + 1, str);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter anything to check pallindrom or not : ");
        String str = sc.nextLine();
        boolean result = pallindromeOrNot(0, str.toLowerCase());
        if(result) System.out.print(str + " is pallindrome");
        else System.out.print(str + " is not Pallindrome");
    }
}
