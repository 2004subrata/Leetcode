import java.util.Scanner;

public class PallindromeOrNot {
    public static boolean pallindrome(int n) {
        n = Math.abs(n);
        int originalNum = n;
        int reverse = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            reverse = (reverse * 10) + lastDigit;
            n = n / 10;
        }
        // check Pallindrome or not
        if (originalNum == reverse)
            return true;
        else
            return false;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hey! Enter a number for check Pallindrome or not : ");
        int n = sc.nextInt();
        boolean isPallindrome = pallindrome(n);
        if (isPallindrome)
            System.out.println(n + " is Pallindrome");
        else
            System.out.println(n + " is not Pallindrome");
    }
}