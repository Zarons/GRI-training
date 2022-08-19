package paiza.Aランクレベルアップメニュー;

import java.util.*;

//移動が可能かの判定・方角
public class Problem11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int width = sc.nextInt();
        int yCoord = sc.nextInt();
        int xCoord = sc.nextInt();
        String direction = sc.next();
        sc.nextLine();

        char[][] coordArray = new char[height][width];
        for (int row = 0; row < height; row++) {
            coordArray[row] = sc.nextLine().toCharArray();
        }

        switch (direction) {
            case "N" -> yCoord -= 1;
            case "E" -> xCoord += 1;
            case "S" -> yCoord += 1;
            case "W" -> xCoord -= 1;
        }

        if (xCoord < 0 || xCoord >= width || yCoord < 0 || yCoord >= height || coordArray[yCoord][xCoord] == '#') {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
