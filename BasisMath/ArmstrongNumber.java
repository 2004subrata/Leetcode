import java.util.Scanner;

public class ArmstrongNumber {
    public static boolean isArmstrong(int n) {
        int originalNum = n;
        int sum = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            sum = sum + (lastDigit * lastDigit * lastDigit);
            n = n / 10;
        }
        if (originalNum == sum)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check Armstrong number : ");
        int n = sc.nextInt();
        if (isArmstrong(n))
            System.out.println(n + " is a Armstrong Number.");
        else
            System.out.println(n + " is not Armstrong Number.");
    }
}
