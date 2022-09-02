package paiza.Aランクレベルアップメニュー;

import java.util.Scanner;

// STEP: 1 規則的な数列の和
public class Problem7_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long start = sc.nextLong();
        long end = sc.nextLong();

        int[] map = {1, 0, -1, 1, 0, -1};

        int newStart = (int) (start % 3);
        int newEnd = (int) (end % 3);
        if (newStart == 0) newStart = 3;
        if (newEnd == 0) newEnd = 3;

        if (newStart < newEnd) newEnd += 3;

        int sum = 0;
        for (int i = newStart; i <= newEnd; i++) {
            sum += map[i - 1];
        }

        System.out.println(sum);
    }
}
