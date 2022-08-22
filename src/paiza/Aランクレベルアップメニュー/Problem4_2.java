package paiza.Aランクレベルアップメニュー;

import java.util.Scanner;

//マスの陣取り2
public class Problem4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sy = sc.nextInt();
        int sx = sc.nextInt();
        sc.nextLine();

        char[][] map = new char[sy][sx];
        for (int row = 0; row < sy; row++) {
            map[row] = sc.nextLine().toCharArray();
        }

        for (int row = 0; row < sy; row++) {
            for (int col = 0; col < sx; col++) {
                if (col > 0 && map[row][col] != '#' && map[row][col - 1] == '*') map[row][col] = 'M';
                if (col < sx - 1 && map[row][col] != '#' && map[row][col + 1] == '*') map[row][col] = 'M';
                if (row > 0 && map[row][col] != '#' && map[row - 1][col] == '*') map[row][col] = 'M';
                if (row < sy - 1 && map[row][col] != '#' && map[row + 1][col] == '*') map[row][col] = 'M';
            }
        }

        for (int row = 0; row < sy; row++) {
            for (int col = 0; col < sx; col++) {
                if (map[row][col] == 'M') map[row][col] = '*';
            }
            System.out.println(map[row]);
        }
    }
}
