package BasicHashing;

import java.util.Scanner;

public class StringHashing {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String s = sc.nextLine();

        int[] hash = new int[256];
        for(int i = 0; i<s.length(); i++){
            hash[s.charAt(i)] += 1;
        }

        System.out.print("Enter the query number : ");
        int q = sc.nextInt();

        while(q-- > 0){
            char ch = sc.next().charAt(0);
            System.out.println(hash[ch]);
        }
    }
}
