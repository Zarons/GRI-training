package paiza.Aランクレベルアップメニュー;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//STEP: 4 マップの判定・縦
public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] initializers = sc.nextLine().split(" ");
        int height = Integer.parseInt(initializers[0]);
        int width = Integer.parseInt(initializers[1]);

        char[][] coordArray = new char[height][width];
        for (int row = 0; row < height; row++) {
            String input = sc.nextLine();
            for (int col = 0; col < width; col++) {
                coordArray[row][col] = input.charAt(col);
            }
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
