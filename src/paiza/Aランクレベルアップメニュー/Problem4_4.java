package paiza.Aランクレベルアップメニュー;

import java.util.Scanner;

//STEP: 4 陣取りの手間
public class Problem4_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sy = sc.nextInt();
        int sx = sc.nextInt();
        sc.nextLine();

        char[][] map = new char[sy][sx];
        for (int row = 0; row < sy; row++) {
            map[row] = sc.nextLine().toCharArray();
        }

        for (int i = 0; i <= 9; i++) {
            char curChar = (i + "").charAt(0);
            for (int row = 0; row < sy; row++) {
                for (int col = 0; col < sx; col++) {
                    if (map[row][col] == '*') {
                        if (col + 1 < sx && map[row][col + 1] != '#' && map[row][col + 1] == '.') { // 右の表座を確認する
                            map[row][col + 1] = 'M';
                        }
                        if (col - 1 >= 0 && map[row][col - 1] != '#' && map[row][col - 1] == '.') { // 左の表座を確認する
                            map[row][col - 1] = 'M';
                        }
                        if (row - 1 >= 0 && map[row - 1][col] != '#' && map[row - 1][col] == '.') { // 上の表座を確認する
                            map[row - 1][col] = 'M';
                        }
                        if (row + 1 < sy && map[row + 1][col] != '#' && map[row + 1][col] == '.') { // 下の表座を確認する
                            map[row + 1][col] = 'M';
                        }
                    }
                }
            }
            for (int row = 0; row < sy; row++) {
                for (int col = 0; col < sx; col++) {
                    if (map[row][col] == '*') map[row][col] = curChar;
                    if (map[row][col] == 'M') map[row][col] = '*';
                }
            }
        }
        for (int row = 0; row < sy; row++) {
            System.out.println(map[row]);
        }
    }
}
