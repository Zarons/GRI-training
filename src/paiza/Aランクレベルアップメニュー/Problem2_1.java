package paiza.Aランクレベルアップメニュー;

import java.util.*;

//マップからの座標取得
public class Problem2_1 {
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
                if (coordArray[row][col] == '#') System.out.println(row + " " + col);
            }
        }
    }
}
