package paiza.Aランクレベルアップメニュー;

import java.util.*;

//盤面の情報変更
public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] initializers = sc.nextLine().split(" ");
        int height = Integer.parseInt(initializers[0]);
        int width = Integer.parseInt(initializers[1]);
        int totalGivenCoord =Integer.parseInt(initializers[2]);

        char[][] coordArray = new char[height][width];
        for (int row = 0; row < height; row++) {
            String input = sc.nextLine();
            for (int col = 0; col < width; col++) {
                coordArray[row][col] = input.charAt(col);
            }
        }

        for (int i = 1; i <= totalGivenCoord; i++) {
            String[] givenCoord = sc.nextLine().split(" ");
            int givenYCoord = Integer.parseInt(givenCoord[0]);
            int givenXCoord = Integer.parseInt(givenCoord[1]);
            coordArray[givenYCoord][givenXCoord] = '#';
        }

        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                System.out.print(coordArray[row][col]);
            }
            System.out.println();
        }
    }
}
