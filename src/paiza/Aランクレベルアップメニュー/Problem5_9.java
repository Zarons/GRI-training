package paiza.Aランクレベルアップメニュー;

import java.util.Scanner;

// FINAL いびつなリバーシ対戦
public class Problem5_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int width = sc.nextInt();
        int totalPlayer = sc.nextInt();
        int totalRound = sc.nextInt();
        sc.nextLine();

        char[][] map = new char[height][width];
        for (int row = 0; row < height; row++) {
            map[row] = sc.nextLine().toCharArray();
        }


        for (int round = 1; round <= totalRound ; round++) {
            char player = sc.next().charAt(0);
            int sy = sc.nextInt();
            int sx = sc.nextInt();
            if (Character.getNumericValue(player) > totalPlayer) break; // 簡単な例外処理
            map[sy][sx] = player; // スタート座標
            checkRow(height, sy, sx, map, player);
            checkColumn(width, sy, sx, map, player);
            checkDiagonal1(height,width, sy, sx, map, player);
            checkDiagonal2(height,width, sy, sx, map, player);
        }

        // 新しい二次元配列を表示する
        for (int row = 0; row < height; row++) {
            System.out.println(map[row]);
        }
    }

    // 上と下
    public static void checkRow(int height, int sy, int sx, char[][] map, char player) {
        for (int row = -1; row <= 1; row += 2) { //上は -1　下は 1
            for (int next = 1; ; next++) {
                int newRow = sy + (row * next);
                if (newRow < 0 || newRow >= height || map[newRow][sx] == '#') break;
                if (map[newRow][sx] == player) {
                    for (int i = Math.min(newRow, sy); i <= Math.max(newRow, sy); i++) {
                        map[i][sx] = player;
                    }
                    break;
                }
            }
        }
    }

    // 右と左
    public static void checkColumn(int width, int sy, int sx, char[][] map, char player) {
        for (int col = -1; col <= 1; col += 2) { //左は -1 右は 1
            for (int next = 1; ; next++) {
                int newCol = sx + (col * next);
                if (newCol < 0 || newCol >= width || map[sy][newCol] == '#') break;
                if (map[sy][newCol] == player) {
                    for (int i = Math.min(newCol, sx); i <= Math.max(newCol, sx); i++) {
                        map[sy][i] = player;
                    }
                    break;
                }
            }
        }
    }

    // 左上と右下
    public static void checkDiagonal1(int height, int width, int sy, int sx, char[][] map, char player) {
        for (int direction = -1; direction <= 1; direction += 2) { //上は -1　下は 1
            for (int next = 1; ; next++) { //左は -1 右は 1
                int nextY = sy + (direction * next);
                int nextX = sx + (direction * next);
                if (nextY < 0 || nextY >= height || nextX < 0 || nextX >= width || map[nextY][nextX] == '#') break;
                if (map[nextY][nextX] == player) {
                    for (int i = Math.min(nextY, sy); i <= Math.max(nextY, sy); i++) {
                        map[i][i + (sx - sy)] = player;
                    }
                    break;
                }
            }
        }
    }

    // 右上と左下
    public static void checkDiagonal2(int height, int width, int sy, int sx, char[][] map, char player) {
        for (int direction = -1; direction <= 1; direction += 2) { //上は -1　下は 1
            for (int next = 1; ; next++) { //左は -1 右は 1
                int nextY = sy + (direction * next);
                int nextX = sx - (direction * next);
                if (nextY < 0 || nextY >= height || nextX < 0 || nextX >= width || map[nextY][nextX] == '#') break;
                if (map[nextY][nextX] == player) {
                    for (int i = Math.min(nextY, sy); i <= Math.max(nextY, sy); i++) {
                        map[i][(sx + sy) - i] = player;
                    }
                    break;
                }
            }
        }
    }
}
