package paiza.Aランクレベルアップメニュー;

import java.util.Scanner;

//幅のある移動
public class Problem15 {
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
        map[sy][sx] = '*';

        boolean stop = false;
        String[] directions = {"N", "E", "S", "W"};
        int curDir = 0;
        for (int round = 1; round <= maxRound; round++) {
            String turn = sc.next();
            if (turn.equals("R")) {
                curDir += 1;
            } else {
                curDir += 3;
            }

            int steps = sc.nextInt();
            for (int step = 1; step <= steps; step++) {
                switch (directions[curDir % 4]) {
                    case "N" -> sy -= 1;
                    case "E" -> sx += 1;
                    case "S" -> sy += 1;
                    case "W" -> sx -= 1;
                }

                if (sx < 0 || sx >= width || sy < 0 || sy >= height || map[sy][sx] == '#') {
                    switch (directions[curDir % 4]) {
                        case "N" -> sy += 1;
                        case "E" -> sx -= 1;
                        case "S" -> sy -= 1;
                        case "W" -> sx += 1;
                    }
                    stop = true;
                    break;
                } else {
                    map[sy][sx] = '*';
                }
            }
            if (stop) break;
        }
        for (int row = 0; row < height; row++) {
            System.out.println(map[row]);
        }
    }
}
