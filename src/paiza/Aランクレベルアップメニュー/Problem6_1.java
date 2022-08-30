package paiza.Aランクレベルアップメニュー;

import java.util.Scanner;

// STEP: 1 累積和の計算

public class Problem6_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalInput = sc.nextInt();
        sc.nextLine();
        String[] numString = sc.nextLine().split(" ");

        int total = 0;
        for (String s : numString) {
            int number = Integer.parseInt(s);
            total += number;
            System.out.println(total);
        }
    }
}
