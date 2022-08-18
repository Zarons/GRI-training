package paiza.Aランクレベルアップメニュー;

import java.util.*;

//盤面の情報取得
public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] initializers = sc.nextLine().split(" ");
        int height = Integer.parseInt(initializers[0]);
        int width = Integer.parseInt(initializers[1]);
        int totalGivenCoord =Integer.parseInt(initializers[2]);

        String[] map = new String[height];
        for (int row = 0; row < height; row++) {
            map[row] = sc.nextLine();
        }

        for (int i = 1; i <= totalGivenCoord; i++) {
            String[] givenCoord = sc.nextLine().split(" ");
            int givenYCoord = Integer.parseInt(givenCoord[0]);
            int givenXCoord = Integer.parseInt(givenCoord[1]);
            System.out.println(map[givenYCoord].charAt(givenXCoord));
        }
    }
}
