package paiza.Aランクレベルアップメニュー;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//移動が可能かの判定・方角
public class Problem11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] initializers = sc.nextLine().split(" ");
        int height = Integer.parseInt(initializers[0]);
        int width = Integer.parseInt(initializers[1]);
        int yCoord = Integer.parseInt(initializers[2]);
        int xCoord = Integer.parseInt(initializers[3]);
        String direction = initializers[4];

        Map<Integer, String> rows = new HashMap<>();
        for (int i = 0; i < height; i++) {
            String input = sc.nextLine().substring(0, width);
            rows.put(i, input);
        }

        if (direction.equals("N") && yCoord == 0 || yCoord >= height || xCoord >= width ) {
            System.out.println("No");
        } else if (direction.equals("S") && yCoord == height - 1) {
            System.out.println("No");
        } else if (direction.equals("E") && yCoord == width - 1) {
            System.out.println("No");
        } else if (direction.equals("W") && xCoord == 0) {
            System.out.println("No");
        } else {
            switch (direction) {
                case "N" -> {
                    char[] row = rows.get(yCoord - 1).toCharArray();
                    if (row[xCoord] == '#') System.out.println("No");
                    else System.out.println("Yes");
                }
                case "S" -> {
                    char[] row = rows.get(yCoord + 1).toCharArray();
                    if (row[xCoord] == '#') System.out.println("No");
                    else System.out.println("Yes");
                }
                case "E" -> {
                    char[] row = rows.get(yCoord).toCharArray();
                    if (row[yCoord + 1] == '#') System.out.println("No");
                    else System.out.println("Yes");
                }
                case "W" -> {
                    char[] row = rows.get(yCoord).toCharArray();
                    if (row[yCoord - 1] == '#') System.out.println("No");
                    else System.out.println("Yes");
                }
            }
        }
    }
}
