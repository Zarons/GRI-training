package paiza.Aランクレベルアップメニュー;

import java.util.*;

//盤面の情報変更
public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int width = sc.nextInt();
        int totalGivenCoord = sc.nextInt(); sc.nextLine();

        char[][] coordArray = new char[height][width];
        for (int row = 0; row < height; row++) {
            coordArray[row] = sc.nextLine().toCharArray();
        }

        for (int i = 1; i <= totalGivenCoord; i++) {
            int givenYCoord = sc.nextInt();
            int givenXCoord = sc.nextInt();
            coordArray[givenYCoord][givenXCoord] = '#';
        }

        for (int row = 0; row < height; row++) {
            System.out.println(coordArray[row]);
        }
    }
}
