package paiza.Aランクレベルアップメニュー;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//STEP: 4 マップの判定・縦
public class Problem4 {
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
                if (row == 0 || coordArray[row - 1][col] == '#') {
                    if (row == height - 1 || coordArray[row + 1][col] == '#') {
                        System.out.println(row + " " + col);
                    }
                }
            }
        }
    }
}
