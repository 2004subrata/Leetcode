import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Divisor {
    public static void divisor(int n) {
        ArrayList<Integer> ls = new ArrayList<>();
        for (int i = 1; i * i < n; i++) {
            if (n % i == 0) {
                ls.add(i);
                if (n / i != i) {
                    ls.add(n / i);
                }
            }
        }
        Collections.sort(ls);
        for (int i = 0; i < ls.size(); i++) {
            System.out.print(ls.get(i) + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        divisor(n);
    }
}
