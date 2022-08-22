package paiza.Aランクレベルアップメニュー;

import java.util.*;

//移動が可能かの判定・方向
public class Problem3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int width = sc.nextInt();
        int sy = sc.nextInt();
        int sx = sc.nextInt();
        String direction = sc.next();
        String turn = sc.next();
        sc.nextLine();

        char[][] map = new char[height][width];
        for (int row = 0; row < height; row++) {
            map[row] = sc.nextLine().toCharArray();
        }

        int intTurn = turn.equals("R") ? 1 : -1;
        switch (direction) {
            case "N" -> sx += intTurn;
            case "E" -> sy += intTurn;
            case "S" -> sx -= intTurn;
            case "W" -> sy -= intTurn;
        }

        if (sx < 0 || sx >= width || sy < 0 || sy >= height || map[sy][sx] == '#') {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
