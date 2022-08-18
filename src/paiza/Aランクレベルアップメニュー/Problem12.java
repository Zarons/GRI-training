package paiza.Aランクレベルアップメニュー;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//移動が可能かの判定・方向
public class Problem12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] initializers = sc.nextLine().split(" ");
        int height = Integer.parseInt(initializers[0]);
        int width = Integer.parseInt(initializers[1]);
        int yCoord = Integer.parseInt(initializers[2]);
        int xCoord = Integer.parseInt(initializers[3]);
        String direction = initializers[4];
        String turn = initializers[5];

        Map<Integer, String> rows = new HashMap<>();
        for (int i = 0; i < height; i++) {
            String input = sc.nextLine().substring(0, width);
            rows.put(i, input);
        }

        if (turn.equals("L")) {
            switch (direction) {
                case "N" -> {
                    if (xCoord == 0) {
                        System.out.println("No");
                        break;
                    }
                    char[] row = rows.get(yCoord).toCharArray();
                    if (row[xCoord - 1] == '#') System.out.println("No");
                    else System.out.println("Yes");
                }
                case "S" -> {
                    if (xCoord == height - 1) {
                        System.out.println("No");
                        break;
                    }
                    char[] row = rows.get(yCoord).toCharArray();
                    if (row[xCoord + 1] == '#') System.out.println("No");
                    else System.out.println("Yes");
                }
                case "E" -> {
                    if (yCoord == 0) {
                        System.out.println("No");
                        break;
                    }
                    char[] row = rows.get(yCoord - 1).toCharArray();
                    if (row[xCoord] == '#') System.out.println("No");
                    else System.out.println("Yes");
                }
                case "W" -> {
                    if (yCoord == height - 1) {
                        System.out.println("No");
                        break;
                    }
                    char[] row = rows.get(yCoord + 1).toCharArray();
                    if (row[xCoord] == '#') System.out.println("No");
                    else System.out.println("Yes");
                }
            }
        } else if (turn.equals("R")) {
            switch (direction) {
                case "N" -> {
                    if (xCoord == width - 1) {
                        System.out.println("No");
                        break;
                    }
                    char[] row = rows.get(yCoord).toCharArray();
                    if (row[xCoord + 1] == '#') System.out.println("No");
                    else System.out.println("Yes");
                }
                case "S" -> {
                    if (xCoord == 0) {
                        System.out.println("No");
                        break;
                    }
                    char[] row = rows.get(yCoord).toCharArray();
                    if (row[xCoord - 1] == '#') System.out.println("No");
                    else System.out.println("Yes");
                }
                case "E" -> {
                    if (yCoord == height - 1) {
                        System.out.println("No");
                        break;
                    }
                    char[] row = rows.get(yCoord + 1).toCharArray();
                    if (row[xCoord] == '#') System.out.println("No");
                    else System.out.println("Yes");
                }
                case "W" -> {
                    if (yCoord == 0) {
                        System.out.println("No");
                        break;
                    }
                    char[] row = rows.get(yCoord - 1).toCharArray();
                    if (row[xCoord] == '#') System.out.println("No");
                    else System.out.println("Yes");
                }
            }
        }
    }
}
