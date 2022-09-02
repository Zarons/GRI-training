package paiza.Aランクレベルアップメニュー;

import java.util.Arrays;
import java.util.Scanner;

// STEP: 1 隣接行列
public class Problem8_1 {
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
    }

    public static void addEdge(int i, int j, char[][] map) {
        map[i - 1][j - 1] = '1';
        map[j - 1][i - 1] = '1';
    }
}