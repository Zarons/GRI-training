package paiza.Aランクレベルアップメニュー;

import java.util.*;

//盤面の情報取得
public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int width = sc.nextInt();
        int totalGivenCoord = sc.nextInt(); sc.nextLine();

        char[][] coordArray = new char[height][width];
        for (int row = 0; row < height; row++) {
            String input = sc.nextLine();
            for (int col = 0; col < width; col++) {
                coordArray[row][col] = input.charAt(col);
            }
        }

        for (int i = 1; i <= totalGivenCoord; i++) {
            int givenYCoord = sc.nextInt();
            int givenXCoord = sc.nextInt(); sc.nextLine();
            System.out.println(coordArray[givenYCoord][givenXCoord]);
        }
    }
}
