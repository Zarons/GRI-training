package paiza.Aランクレベルアップメニュー;

import java.util.Scanner;

// STEP: 2 リバーシの操作（縦横）
public class Problem5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int width = sc.nextInt();
        int sy = sc.nextInt();
        int sx = sc.nextInt();
        sc.nextLine();

        //二次元配列の代入
        char[][] map = new char[height][width];
        for (int row = 0; row < height; row++) {
            map[row] = sc.nextLine().toCharArray();
        }

        //上と下
        for (int row = -1; row <= 1; row += 2) { //上は -1　下は 1
            for (int next = 1; ; next++) {
                int nextRow = row * next;
                if (sy + nextRow < 0 || sy + nextRow >= height) break;
                if (map[sy + nextRow][sx] == '*') {
                    for (int i = Math.min(sy + nextRow, sy); i <= Math.max(sy + nextRow, sy); i++) {
                        map[i][sx] = '*';
                    }
                    break;
                }
            }
        }
        //右と左
        for (int col = -1; col <= 1; col += 2) { //左は -1 右は 1
            for (int next = 1; ; next++) {
                int nextCol = col * next;
                if (sx + nextCol < 0 || sx + nextCol >= width) break;
                if (map[sy][sx + nextCol] == '*') {
                    for (int i = Math.min(sx + nextCol, sx); i <= Math.max(sx + nextCol, sx); i++) {
                        map[sy][i] = '*';
                    }
                    break;
                }
            }
        }

        //print new map
        map[sy][sx] = '*';
        for (int row = 0; row < height; row++) {
            System.out.println(map[row]);
        }
    }
}
