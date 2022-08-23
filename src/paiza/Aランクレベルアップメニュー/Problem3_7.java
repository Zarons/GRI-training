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
        int totalInput = sc.nextInt();
        sc.nextLine();

        char[][] map = new char[height][width]; // 二次元配列を作る
        for (int row = 0; row < height; row++) { // 値を代入する
            map[row] = sc.nextLine().toCharArray();
        }

        map[sy][sx] = '*'; // マップ上の (sy, sx) のマス
        String[] directions = {"N", "E", "S", "W"};
        int curDir = 0; // 最初は北向け
        int turnRound = 0;
        String turn = "";
        loop:
        for (int input = 1; input <= totalInput + 1; input++) { // input loop (+1 for after final input)
            if (input <= totalInput) {
                turnRound = sc.nextInt(); // first arg -> turn during x round
                turn = sc.next(); // second arg -> turn x direction
            }
            for (int round = 0; round < 100; round++) { // check total round, need to loop for 100x
                switch (directions[curDir % 4]) {
                    case "N" -> sy -= 1;
                    case "E" -> sx += 1;
                    case "S" -> sy += 1;
                    case "W" -> sx -= 1;
                }
                if (sx < 0 || sx >= width || sy < 0 || sy >= height || map[sy][sx] == '#' || map[sy][sx] == '*') { // 例外 check
                    break loop;
                }
                map[sy][sx] = '*'; // change to '*' after moving to new coord
                if (round > turnRound && input <= totalInput) break;
            }
            curDir += turn.equals("R") ? 1 : 3; // change direction
        }
        for (int row = 0; row < height; row++) System.out.println(map[row]);
    }
}
