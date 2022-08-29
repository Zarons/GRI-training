package paiza.Aランクレベルアップメニュー;

import java.util.Scanner;

// STEP: 4 リバーシの操作（斜め）
public class Problem5_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int width = sc.nextInt();
        int sy = sc.nextInt();
        int sx = sc.nextInt();
        sc.nextLine();

        char[][] map = new char[height][width];
        for (int row = 0; row < height; row++) {
            map[row] = sc.nextLine().toCharArray();
        }

        //左上と右下
        for (int direction = -1; direction <= 1; direction += 2) { //上は -1　下は 1
            for (int next = 1; ; next++) { //左は -1 右は 1
                int nextY = sy + (direction * next);
                int nextX = sx + (direction * next);
                if (nextY < 0 || nextY >= height || nextX < 0 || nextX >= width)
                    break;
                if (map[nextY][nextX] == '*') {
                    for (int i = Math.min(nextY, sy); i <= Math.max(nextY, sy); i++) {
                        map[i][i + (sx - sy)] = '*';
                    }
                    break;
                }
            }
        }

        //右上と左下
        for (int direction = -1; direction <= 1; direction += 2) { //上は -1　下は 1
            for (int next = 1; ; next++) { //左は -1 右は 1
                int nextY = sy + (direction * next);
                int nextX = sx - (direction * next);
                if (nextY < 0 || nextY >= height || nextX < 0 || nextX >= width)
                    break;
                if (map[nextY][nextX] == '*') {
                    for (int i = Math.min(nextY, sy); i <= Math.max(nextY, sy); i++) {
                        map[i][(sx + sy) - i] = '*';
                    }
                    break;
                }
            }
        }

        // 結果を表示する
        map[sy][sx] = '*';
        for (int row = 0; row < height; row++) {
            System.out.println(map[row]);
        }
    }
}
