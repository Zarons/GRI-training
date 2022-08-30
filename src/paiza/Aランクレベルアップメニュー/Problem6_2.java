package paiza.Aランクレベルアップメニュー;

import java.util.Scanner;

// STEP: 2 べき乗の計算
public class Problem6_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalNumbers = sc.nextInt();
        sc.nextLine();

        int[] numArray = new int[totalNumbers];
        for (int i = 0; i < totalNumbers; i++) {
            numArray[i] = sc.nextInt();
        }

        int inputs = sc.nextInt();
        for (int input = 0; input < inputs; input++) {
            int index = sc.nextInt();
            int endIndex = sc.nextInt();
            int totalSum = 0;
            for (; index <= endIndex; index++) {
                totalSum += numArray[index];
            }
            System.out.println(totalSum);
        }
    }
}
