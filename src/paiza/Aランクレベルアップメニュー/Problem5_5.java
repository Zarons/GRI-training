package paiza.Aランクレベルアップメニュー;

import java.util.Scanner;

// STEP: 4 リバーシの操作（斜め）
public class Problem5_5 {
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

        map[sy][sx] = '*'; // スタート座標

        int col = sx;
        top_right: // 右上
        for (int row = sy - 1; row >= 0; row--) {
            col++;
            if (col >= width) break;
            else if (map[row][col] == '*') {
                while (row < sy) {
                    row++;
                    col--;
                    if (row == sy) break top_right;
                    map[row][col] = '*';
                }
            }
        }

        col = sx; // col リセットする
        top_left: // 左上
        for (int row = sy - 1; row >= 0; row--) {
            col--;
            if (col < 0) break;
            if (map[row][col] == '*') {
                while (row < sy) {
                    row++;
                    col++;
                    if (row == sy) break top_left;
                    map[row][col] = '*';
                }
            }
        }

        col = sx; // col リセットする
        bottom_right: // 左下
        for (int row = sy + 1; row < height; row++) {
            col++;
            if (col >= width) break;
            else if (map[row][col] == '*') {
                while (row > sy) {
                    row--;
                    col--;
                    if (row == sy) break bottom_right;
                    map[row][col] = '*';
                }
            }
        }

        col = sx; // col リセットする
        bottom_left: // 左下
        for (int row = sy + 1; row < height; row++) {
            col--;
            if (col < 0) break;
            else if (map[row][col] == '*') {
                while (row > sy) {
                    row--;
                    col++;
                    if (row == sy) break bottom_left;
                    map[row][col] = '*';
                }
            }
        }

        //上側
        for (int row = sy - 1; row >= 0; row--) {
            if (map[row][sx] == '*') {
                for (int start = row; start < sy; start++) {
                    map[start][sx] = '*';
                }
                break;
            }
        }
        //右側
        for (col = sx + 1; col < width; col++) {
            if (map[sy][col] == '*') {
                for (int start = col; start > sx; start--) {
                    map[sy][start] = '*';
                }
                break;
            }
        }
        //下側
        for (int row = sy + 1; row < height; row++) {
            if (map[row][sx] == '*') {
                for (int start = row; start > sy; start--) {
                    map[start][sx] = '*';
                }
                break;
            }
        }
        //左側から
        for (col = sx - 1; col >= 0; col--) {
            if (map[sy][col] == '*') {
                for (int start = col; start < sx; start++) {
                    map[sy][start] = '*';
                }
                break;
            }
        }

        // 結果を表示する
        for (int row = 0; row < height; row++) {
            System.out.println(map[row]);
        }
    }
}
