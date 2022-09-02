package paiza.Aランクレベルアップメニュー;

import java.util.Arrays;
import java.util.Scanner;

// STEP: 3 有向グラフの隣接行列と隣接リスト
public class Problem8_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mapSize = sc.nextInt();
        int totalInput = sc.nextInt();

        char[][] map = new char[mapSize][mapSize];
        for (int row = 0; row < mapSize; row++) {
            Arrays.fill(map[row], '0');
        }

        for (int input = 0; input < totalInput; input++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            addEdge(i, j, map);
        }

        for (int row = 0; row < mapSize; row++) {
            System.out.println(map[row]);
        }

        for (int row = 0; row < mapSize; row++) {
            if (new String(map[row]).contains("1")){
                for (int col = 0; col < mapSize; col++) {
                    if (map[row][col] == '1') {
                        System.out.print(col);
                    }
                }
            }
            System.out.println();
        }
    }

    public static void addEdge(int i, int j, char[][] map) {
        map[i - 1][j - 1] = '1';
    }
}