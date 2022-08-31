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

        int sum = 0;
        int ans = numArray.length + 1;
        int startIndex = 0;
        int endIndex = 0;
        sum += numArray[0];
        while (true) {
            if (sum < goal) {
                endIndex++;
                if (endIndex == totalNumbers) break;
                sum += numArray[endIndex];
            } else {
                ans = Math.min(ans, endIndex - startIndex + 1);
                sum -= numArray[startIndex];
                startIndex++;
            }
        }
        System.out.println(ans == numArray.length + 1 ? -1 : ans);
    }
}
