package paiza.Aランクレベルアップメニュー;

import java.util.Arrays;
import java.util.Scanner;

// STEP: 4 重みあり有向グラフの隣接行列と隣接リスト
public class Problem8_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mapSize = sc.nextInt();
        int totalInput = sc.nextInt();

        // 新しい値を二次元配列に入れる
        int[][] map = new int[mapSize][mapSize];
        for (int input = 0; input < totalInput; input++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int newValue = sc.nextInt();
            map[i - 1][j - 1] = newValue;
        }

        // int型の二次元配列をStringとして表示する
        for (int row = 0; row < mapSize; row++) {
            String formattedRow = Arrays.toString(map[row])
                    .replace(",", "")  //remove the commas
                    .replace("[", "")  //remove the left bracket
                    .replace("]", "");  //remove the right bracket
            System.out.println(formattedRow.replaceAll("\\s+",""));
        }

        int[] checkMap = new int[mapSize];
        for (int row = 0; row < mapSize; row++) {
            if (!Arrays.equals(map[row], checkMap)){
                for (int col = 0; col < mapSize; col++) {
                    if (map[row][col] != 0) {
                        System.out.print(col + "(" + map[row][col] + ")");
                    }
                }
            }
            System.out.println();
        }
    }
}