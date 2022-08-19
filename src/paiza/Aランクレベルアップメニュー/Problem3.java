package paiza.Aランクレベルアップメニュー;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//マップの判定・横
public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int width = sc.nextInt(); sc.nextLine();

        char[][] coordArray = new char[height][width];
        for (int row = 0; row < height; row++) {
            coordArray[row] = sc.nextLine().toCharArray();
        }

        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                if (col == 0 || coordArray[row][col - 1] == '#') {
                    if (col == width - 1 || coordArray[row][col + 1] == '#') {
                        System.out.println(row + " " + col);
                    }
                }
            }
        }
    }
}
