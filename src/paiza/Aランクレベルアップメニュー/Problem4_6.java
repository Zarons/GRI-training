package paiza.Aランクレベルアップメニュー;

import java.util.Scanner;

//FINAL 陣取りゲーム
public class Problem4_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sy = sc.nextInt();
        int sx = sc.nextInt();
        sc.nextLine();

        char firstChar = sc.next().charAt(0);
        char secondChar = firstChar == 'A' ? 'B' : 'A';
        char firstTempChar = firstChar == 'A' ? 'a' : 'b';
        char secondTempChar = firstChar == 'A' ? 'b' : 'a';
        sc.nextLine();

        char[][] map = new char[sy][sx];
        for (int row = 0; row < sy; row++) {
            map[row] = sc.nextLine().toCharArray();
        }

        for (int i = 0; i < sy * sx; i++) {
            for (int row = 0; row < sy; row++) {
                for (int col = 0; col < sx; col++) {
                    if (map[row][col] == firstChar) {
                        if (col + 1 < sx && map[row][col + 1] != '#' && map[row][col + 1] == '.') { // 右の表座を確認する
                            map[row][col + 1] = firstTempChar;
                        }
                        if (col - 1 >= 0 && map[row][col - 1] != '#' && map[row][col - 1] == '.') { // 左の表座を確認する
                            map[row][col - 1] = firstTempChar;
                        }
                        if (row - 1 >= 0 && map[row - 1][col] != '#' && map[row - 1][col] == '.') { // 上の表座を確認する
                            map[row - 1][col] = firstTempChar;
                        }
                        if (row + 1 < sy && map[row + 1][col] != '#' && map[row + 1][col] == '.') { // 下の表座を確認する
                            map[row + 1][col] = firstTempChar;
                        }
                    }
                }
                for (int col = 0; col < sx; col++) {
                    if (map[row][col] == secondChar) {
                        if (col + 1 < sx && map[row][col + 1] != '#' && map[row][col + 1] == '.') { // 右の表座を確認する
                            map[row][col + 1] = secondTempChar;
                        }
                        if (col - 1 >= 0 && map[row][col - 1] != '#' && map[row][col - 1] == '.') { // 左の表座を確認する
                            map[row][col - 1] = secondTempChar;
                        }
                        if (row - 1 >= 0 && map[row - 1][col] != '#' && map[row - 1][col] == '.') { // 上の表座を確認する
                            map[row - 1][col] = secondTempChar;
                        }
                        if (row + 1 < sy && map[row + 1][col] != '#' && map[row + 1][col] == '.') { // 下の表座を確認する
                            map[row + 1][col] = secondTempChar;
                        }
                    }
                }
            }
            for (int row = 0; row < sy; row++) {
                for (int col = 0; col < sx; col++) {
                    if (map[row][col] == 'a') map[row][col] = 'A';
                    if (map[row][col] == 'b') map[row][col] = 'B';
                }
            }
        }

        int countA = 0;
        int countB = 0;
        for (int row = 0; row < sy; row++) {
            for (int col = 0; col < sx; col++) {
                if (map[row][col] == 'A') countA++;
                if (map[row][col] == 'B') countB++;
            }
        }
        String winner = countA > countB ? "A" : "B";
        System.out.println(countA + " " + countB);
        System.out.println(winner);
    }
}
