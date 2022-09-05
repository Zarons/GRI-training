package paiza.Aランクレベルアップメニュー;

import java.util.Arrays;
import java.util.Scanner;

// FINAL 連結の判定
public class Problem8_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mapSize = sc.nextInt();
        int edges = sc.nextInt();

        int[][] map = new int[mapSize][mapSize];
        for (int edge = 0; edge < edges; edge++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            map[a - 1][b - 1] = 1;
            map[b - 1][a - 1] = 1;
        }

        boolean isValid = true;
        for (int row = 0; row < mapSize; row++) {
            String checkStr = Arrays.toString(map[row]);
            if (!checkStr.contains("1")) {
                System.out.println(row + "行に「１」整数がない" );
                isValid = false;
                break;
            }
            System.out.println(row + "行に「１」整数が入っている" );
        }
        if (isValid) System.out.println("YES");
        else System.out.println("NO");
    }
}
