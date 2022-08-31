package paiza.Aランクレベルアップメニュー;

import java.util.Scanner;

// STEP: 4 最長の区間
public class Problem6_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalNumbers = sc.nextInt();
        int goal = sc.nextInt();
        sc.nextLine();

        int[] numArray = new int[totalNumbers];
        for (int i = 0; i < totalNumbers; i++) {
            numArray[i] = sc.nextInt();
        }

        int sum = 0;
        int ans = 0;
        int startIndex = 0;
        int endIndex = 0;
        sum += numArray[0];
        while (true) {
            if (sum <= goal) {
                ans = Math.max(ans, endIndex - startIndex + 1);
                endIndex++;
                if (endIndex == totalNumbers) break;
                sum += numArray[endIndex];
            } else {
                sum -= numArray[startIndex];
                startIndex++;
            }
        }
        System.out.println(ans);
    }
}
