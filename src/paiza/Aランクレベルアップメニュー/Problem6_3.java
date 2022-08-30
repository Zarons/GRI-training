package paiza.Aランクレベルアップメニュー;

import java.util.Scanner;

// STEP: 3 最短の区間
public class Problem6_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalNumbers = sc.nextInt();
        int goal = sc.nextInt();
        sc.nextLine();

        int[] numArray = new int[totalNumbers];
        for (int i = 0; i < totalNumbers; i++) {
            numArray[i] = sc.nextInt();
        }

        boolean success = false;
        int length;
        loop:
        for (length = 1; length <= numArray.length; length++) {
            int limit = length;
            for (int i = 0; i < numArray.length; i++) { // starting index
                int sum = 0;
                for (int j = i; j < limit; j++) {
                    sum += numArray[j];
                }
                if (sum >= goal) {
                    success = true;
                    break loop;
                }
                limit++;
                if (limit > numArray.length) break;
            }
        }

        if (success) System.out.println(length);
        else System.out.println(-1);
    }
}
