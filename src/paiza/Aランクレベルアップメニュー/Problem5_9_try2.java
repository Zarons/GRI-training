package paiza.Aランクレベルアップメニュー;

import java.util.Scanner;

// FINAL いびつなリバーシ対戦
public class Problem5_9_try2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int width = sc.nextInt();
        int totalPlayer = sc.nextInt();
        int totalRound = sc.nextInt();
        sc.nextLine();

        char[][] map = new char[height][width];
        for (int row = 0; row < height; row++) {
            map[row] = sc.nextLine().toCharArray();
        }

        for (int round = 1; round <= totalRound; round++) {
            char player = sc.next().charAt(0);
            int sy = sc.nextInt();
            int sx = sc.nextInt();
            if (Character.getNumericValue(player) > totalPlayer) break; // 簡単な例外処理
            map[sy][sx] = player; // スタート座標
            checkAllSide(height, width, sy, sx, map, player);
        }

        // 新しい二次元配列を表示する
        for (int row = 0; row < height; row++) {
            System.out.println(map[row]);
        }
    }

    // 縦横斜めを確認する
    public static void checkAllSide(int height, int width, int sy, int sx, char[][] map, char player) {
        for (int dy = -1; dy <= 1; dy++) {
            for (int dx = -1; dx <= 1; dx++) {
                if (dy == 0 && dx == 0) continue;

                int length;
                boolean sideIsValid = false;
                for (length = 1; ; length++) {
                    int ny = sy + (dy * length);
                    int nx = sx + (dx * length);
                    if (ny < 0 || ny >= height || nx < 0 || nx >= width || map[ny][nx] == '#') break;
                    if (map[ny][nx] == player) {
                        sideIsValid = true;
                        break;
                    }
                }

                if (sideIsValid) {
                    for (; length >= 1; length--) {
                        int ny = sy + (dy * length);
                        int nx = sx + (dx * length);
                        map[ny][nx] = player;
                    }
                }
            }
        }
    }
}
