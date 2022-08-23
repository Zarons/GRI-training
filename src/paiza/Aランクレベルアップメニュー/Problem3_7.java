package paiza.Aランクレベルアップメニュー;

import java.util.Scanner;

//へび
public class Problem3_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int width = sc.nextInt();
        int sy = sc.nextInt();
        int sx = sc.nextInt();
        int totalTurn = sc.nextInt();
        sc.nextLine();

        char[][] map = new char[height][width]; // 二次元配列を作る
        for (int row = 0; row < height; row++) { // 値を代入する
            map[row] = sc.nextLine().toCharArray();
        }

        map[sy][sx] = '*'; // マップ上の (sy, sx) のマス
        String[] directions = {"N", "E", "S", "W"};
        int curDir = 0; // 最初は北向け
        int turnRound = sc.nextInt(); // 最初の向く
        String turn = sc.next();
        int turned = 0; // 向いた時のカウント
        for (int round = 0; round < 100; round++) {
            if (round == turnRound) {
                curDir += turn.equals("R") ? 1 : 3; // 向く
                turned++; // 向いた
                if (turned < totalTurn) { // 次の向く
                    turnRound = sc.nextInt();
                    turn = sc.next();
                }
            }
            switch (directions[curDir % 4]) {
                case "N" -> sy -= 1;
                case "E" -> sx += 1;
                case "S" -> sy += 1;
                case "W" -> sx -= 1;
            }
            if (sx < 0 || sx >= width || sy < 0 || sy >= height || map[sy][sx] == '#' || map[sy][sx] == '*') { // 例外check
                break;
            }
            map[sy][sx] = '*'; // OKであれば、座標の値を変更する
        }
        for (int row = 0; row < height; row++) System.out.println(map[row]);
    }
}
