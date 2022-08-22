package paiza.Aランクレベルアップメニュー;

import java.util.Scanner;

//提出結果サマリ
public class Problem4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sy = sc.nextInt();
        int sx = sc.nextInt();
        sc.nextLine();

        char[][] map = new char[sy][sx];
        for (int row = 0; row < sy; row++) {
            map[row] = sc.nextLine().toCharArray();
        }

        for (int i = 0; i < 500; i++) {
            for (int row = 0; row < sy; row++) {
                for (int col = 0; col < sx; col++) {
                    if (col > 0 && map[row][col] != '#' && map[row][col - 1] == '*') map[row][col] = '*';
                    if (col < sx - 1 && map[row][col] != '#' && map[row][col + 1] == '*') map[row][col] = '*';
                    if (row > 0 && map[row][col] != '#' && map[row - 1][col] == '*') map[row][col] = '*';
                    if (row < sy - 1 && map[row][col] != '#' && map[row + 1][col] == '*') map[row][col] = '*';
                }
            }
        }
        for (int row = 0; row < sy; row++) {
            System.out.println(map[row]);
        }
    }
}
