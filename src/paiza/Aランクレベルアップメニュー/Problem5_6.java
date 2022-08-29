package paiza.Aランクレベルアップメニュー;

import java.util.Scanner;

// STEP: 6 いびつなひとりリバーシ（１ターン）
public class Problem5_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int width = sc.nextInt();
        sc.nextLine();

        char[][] map = new char[height][width];
        for (int row = 0; row < height; row++) {
            map[row] = sc.nextLine().toCharArray();
        }

        int sx = 0;
        int sy = 0;
        for (int row = 0; row < height; row++) {
            if (String.valueOf(map[row]).indexOf('!') != -1) {
                for (int col = 0; col < width; col++) {
                    if (map[row][col] == '!') {
                        sy = row;
                        sx = col;
                        break;
                    }
                }
            }
        }

        //上と下
        for (int row = -1; row <= 1; row += 2) { //上は -1　下は 1
            for (int next = 1; ; next++) {
                int newRow = sy + (row * next);
                if (newRow < 0 || newRow >= height || map[newRow][sx] == '#') break;
                if (map[newRow][sx] == '*') {
                    for (int i = Math.min(newRow, sy); i <= Math.max(newRow, sy); i++) {
                        map[i][sx] = '*';
                    }
                    break;
                }
            }
        }

        //右と左
        for (int col = -1; col <= 1; col += 2) { //左は -1 右は 1
            for (int next = 1; ; next++) {
                int newCol = sx + (col * next);
                if (newCol < 0 || newCol >= width || map[sy][newCol] == '#') break;
                if (map[sy][newCol] == '*') {
                    for (int i = Math.min(newCol, sx); i <= Math.max(newCol, sx); i++) {
                        map[sy][i] = '*';
                    }
                    break;
                }
            }
        }

        //左上と右下
        for (int direction = -1; direction <= 1; direction += 2) { //上は -1　下は 1
            for (int next = 1; ; next++) { //左は -1 右は 1
                int nextY = sy + (direction * next);
                int nextX = sx + (direction * next);
                if (nextY < 0 || nextY >= height || nextX < 0 || nextX >= width  || map[nextY][nextX] == '#') break;
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
                if (nextY < 0 || nextY >= height || nextX < 0 || nextX >= width  || map[nextY][nextX] == '#') break;
                if (map[nextY][nextX] == '*') {
                    for (int i = Math.min(nextY, sy); i <= Math.max(nextY, sy); i++) {
                        map[i][(sx + sy) - i] = '*';
                    }
                    break;
                }
            }
        }

        // 新しい二次元配列を表示する
        map[sy][sx] = '*'; // スタート座標
        for (int row = 0; row < height; row++) {
            System.out.println(map[row]);
        }
    }
}
