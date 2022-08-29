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

        // 右上
        int col = sx;
        top_right:
        // 右上
        for (int row = sy - 1; row >= 0; row--) {
            col++;
            if (col >= width || (map[row][col] == '#')) break;
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
        top_left:
        // 左上
        for (int row = sy - 1; row >= 0; row--) {
            col--;
            if (col < 0 || (map[row][col] == '#')) break;
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
        bottom_right:
        // 右下
        for (int row = sy + 1; row < height; row++) {
            col++;
            if (col >= width || (map[row][col] == '#')) break;
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
        bottom_left:
        // 左下
        for (int row = sy + 1; row < height; row++) {
            col--;
            if (col < 0 || (map[row][col] == '#')) break;
            else if (map[row][col] == '*') {
                while (row > sy) {
                    row--;
                    col++;
                    if (row == sy) break bottom_left;
                    map[row][col] = '*';
                }
            }
        }

        //上
        for (int row = sy - 1; row >= 0; row--) {
            if (map[row][sx] == '#') break;
            else if (map[row][sx] == '*') {
                for (int start = row; start < sy; start++) {
                    map[start][sx] = '*';
                }
                break;
            }
        }

        //右
        for (col = sx + 1; col < width; col++) {
            if (map[sy][col] == '#') break;
            else if (map[sy][col] == '*') {
                for (int start = col; start > sx; start--) {
                    map[sy][start] = '*';
                }
                break;
            }
        }

        //下
        for (int row = sy + 1; row < height; row++) {
            if (map[row][sx] == '#') break;
            else if (map[row][sx] == '*') {
                for (int start = row; start > sy; start--) {
                    map[start][sx] = '*';
                }
                break;
            }
        }

        //左
        for (col = sx - 1; col >= 0; col--) {
            if (map[sy][col] == '#') break;
            else if (map[sy][col] == '*') {
                for (int start = col; start < sx; start++) {
                    map[sy][start] = '*';
                }
                break;
            }
        }

        // 結果を表示する
        map[sy][sx] = '*';
        for (int row = 0; row < height; row++) {
            System.out.println(map[row]);
        }
    }
}
