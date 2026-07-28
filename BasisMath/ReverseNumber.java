import java.util.Scanner;

public class ReverseNumber {

    public static int reverseNum(int n) {
        int reverse = 0;
        n = Math.abs(n);
        while (n > 0) {
            int lastDigit = n % 10;
            reverse = (reverse * 10) + lastDigit;
            n = n / 10;
        }
        return reverse;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Hey bro! Enter a number for reverse : ");
        int n = sc.nextInt();
        int reverse = reverseNum(n);
        System.err.println("Reverse number of " + n + " is " + reverse);
    }
}
