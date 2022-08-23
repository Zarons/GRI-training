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
        map[sy][sx] = '*';
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
        for (int col = sx + 1; col < width; col++) {
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
        for (int col = sx - 1; col >= 0; col--) {
            if (map[sy][col] == '*') {
                for (int start = col; start < sx; start++) {
                    map[sy][start] = '*';
                }
                break;
            }
        }
        //print new map
        for (int row = 0; row < height; row++) {
            System.out.println(map[row]);
        }
    }
}
