package paiza.Aランクレベルアップメニュー;

import java.util.*;

//マップの判定・縦横
public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int width = sc.nextInt();
        sc.nextLine();

        char[][] coordArray = new char[height][width];
        for (int row = 0; row < height; row++) {
            coordArray[row] = sc.nextLine().toCharArray();
        }

        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                if (col > 0 && coordArray[row][col - 1] == '.') continue;
                if (col < width - 1 && coordArray[row][col + 1] == '.') continue;
                if (row > 0 && coordArray[row - 1][col] == '.') continue;
                if (row < height - 1 && coordArray[row + 1][col] == '.') continue;
                System.out.println(row + " " + col);
            }
        }
    }
}
