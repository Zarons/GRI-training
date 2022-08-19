package paiza.Aランクレベルアップメニュー;

import java.util.*;

//移動が可能かの判定・複数回の移動
public class Problem13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int width = sc.nextInt();
        int sy = sc.nextInt();
        int sx = sc.nextInt();
        int maxRound = sc.nextInt();
        sc.nextLine();

        char[][] map = new char[height][width];
        for (int row = 0; row < height; row++) {
            map[row] = sc.nextLine().toCharArray();
        }

        String[] directions = {"N", "E", "S", "W"};
        int curDir = 0;
        for (int round = 1; round <= maxRound; round++) {
            String turn = sc.next();
            if (turn.equals("R")) {
                curDir += 1;
            } else {
                curDir += 3;
            }

            switch (directions[curDir % 4]) {
                case "N" -> sy -= 1;
                case "E" -> sx += 1;
                case "S" -> sy += 1;
                case "W" -> sx -= 1;
            }

            if (sx < 0 || sx >= width || sy < 0 || sy >= height || map[sy][sx] == '#') {
                System.out.println("Stop");
                break;
            } else {
                System.out.println(sy + " " + sx);
            }
        }
    }
}
