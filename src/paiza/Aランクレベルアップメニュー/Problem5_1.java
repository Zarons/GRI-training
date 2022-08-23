package paiza.Aランクレベルアップメニュー;

import java.util.Scanner;

// STEP: 1 裏返せる可能性（縦横）
public class Problem5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int width = sc.nextInt();
        int sy = sc.nextInt();
        int sx = sc.nextInt();

        char[][] map = new char[height][width];
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                if (row == sy || col == sx) map[row][col] = '*';
                else map[row][col] = '.';
            }
        }
        map[sy][sx] = '!';
        for (int row = 0; row < height; row++) {
            System.out.println(map[row]);
        }
    }
}
