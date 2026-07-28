import java.util.Scanner;

public class CountNumbers {

    public static int count(int n) {
        n = Math.abs(n);
        int count = 0;
        while (n > 0) {
            n = n/10;
            count++;
        }
        return count;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Hey! Enetr any number for count : ");

        int n = sc.nextInt();
        int totalNumber = count(n);
        System.out.print("Total count of "+ n + " is " + totalNumber);
    }
}