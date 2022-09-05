package paiza.Aランクレベルアップメニュー;

import java.util.Scanner;

// STEP: 5 一方通行（グラフ上の移動）
public class Problem8_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalInput = sc.nextInt();

        int[][] map = new int[totalInput][totalInput];
        for (int row = 0; row < totalInput; row++) {
            for (int col = 0; col < totalInput; col++) {
                map[row][col] = 0;
            }
        }

        for (int input = 0; input < totalInput - 1; input++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            map[a - 1][b - 1] = 1;
            map[b - 1][a - 1] = 1;
        }

        int index = 0;
        for (int count = 0; count < totalInput; count++) {
            System.out.println(index + 1);
            for (int col = 0; col < totalInput; col++) {
                if (map[index][col] == 1) {
                    map[index][col] = 0;
                    map[col][index] = 0;
                    index = col;
                    break;
                }
            }
        }
    }
}
