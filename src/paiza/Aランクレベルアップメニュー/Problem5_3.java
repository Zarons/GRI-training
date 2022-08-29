package paiza.Aランクレベルアップメニュー;

import java.util.Scanner;

// STEP: 3 裏返せる可能性（斜め）
public class Problem5_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int width = sc.nextInt();
        int sy = sc.nextInt();
        int sx = sc.nextInt();

        //二次元配列の代入
        char[][] map = new char[height][width];
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                //斜め数学パターン
                if ((row - sy) - (col - sx) == 0 || (row - sy) + (col - sx) == 0 ) map[row][col] = '*';
                else map[row][col] = '.';
            }
        }

        //print new map
        map[sy][sx] = '!';
        for (int row = 0; row < height; row++) {
            System.out.println(map[row]);
        }
    }
}
