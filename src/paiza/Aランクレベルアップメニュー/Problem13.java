package paiza.Aランクレベルアップメニュー;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//移動が可能かの判定・複数回の移動
public class Problem13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] initializers = sc.nextLine().split(" ");
        int height = Integer.parseInt(initializers[0]);
        int width = Integer.parseInt(initializers[1]);
        int yCoord = Integer.parseInt(initializers[2]);
        int xCoord = Integer.parseInt(initializers[3]);
        int maxTurnCount = Integer.parseInt(initializers[4]);

        String direction = "N";

        Map<Integer, String> rows = new HashMap<>();
        for (int i = 0; i < height; i++) {
            String input = sc.nextLine().substring(0, width);
            rows.put(i, input);
        }

        label:
        for (int curTurnCount = 1; curTurnCount <= maxTurnCount; curTurnCount++) {
            //TODO function to change direction and print 座標
            String turn = sc.nextLine();
            if (turn.equals("L")) {
                switch (direction) {
                    case "N" -> {
                        char[] row = rows.get(yCoord).toCharArray();
                        xCoord -= 1;
                        if (xCoord < 0) {
                            System.out.println("Stop");
                            break label;
                        } else if (row[xCoord] == '#') {
                            System.out.println("Stop");
                            break label;
                        } else {
                            System.out.println(yCoord + " " + xCoord);
                            direction = "W";
                        }
                    }
                    case "S" -> {
                        char[] row = rows.get(yCoord).toCharArray();
                        xCoord += 1;
                        if (xCoord > width - 1) {
                            System.out.println("Stop");
                            break label;
                        } else if (row[xCoord] == '#') {
                            System.out.println("Stop");
                            break label;
                        } else {
                            System.out.println(yCoord + " " + xCoord);
                            direction = "E";
                        }
                    }
                    case "E" -> {
                        yCoord -= 1;
                        if (yCoord < 0) {
                            System.out.println("Stop");
                            break label;
                        }
                        char[] row = rows.get(yCoord).toCharArray();
                        if (row[xCoord] == '#') {
                            System.out.println("Stop");
                            break label;
                        } else {
                            System.out.println(yCoord + " " + xCoord);
                            direction = "N";
                        }
                    }
                    case "W" -> {
                        yCoord += 1;
                        if (yCoord > height - 1) {
                            System.out.println("Stop");
                            break label;
                        }
                        char[] row = rows.get(yCoord).toCharArray();
                        if (row[xCoord] == '#') {
                            System.out.println("Stop");
                            break label;
                        } else {
                            System.out.println(yCoord + " " + xCoord);
                            direction = "S";
                        }
                    }
                }
            } else if (turn.equals("R")) {
                switch (direction) {
                    case "N" -> {
                        char[] row = rows.get(yCoord).toCharArray();
                        xCoord += 1;
                        if (xCoord > width - 1) {
                            System.out.println("Stop");
                            break label;
                        } else if (row[xCoord] == '#') {
                            System.out.println("Stop");
                            break label;
                        } else {
                            System.out.println(yCoord + " " + xCoord);
                            direction = "E";
                        }
                    }
                    case "S" -> {
                        char[] row = rows.get(yCoord).toCharArray();
                        xCoord -= 1;
                        if (xCoord < 0) {
                            System.out.println("Stop");
                            break label;
                        } else if (row[xCoord] == '#') {
                            System.out.println("Stop");
                            break label;
                        } else {
                            System.out.println(yCoord + " " + xCoord);
                            direction = "W";
                        }
                    }
                    case "E" -> {
                        yCoord += 1;
                        if (yCoord > height - 1) {
                            System.out.println("Stop");
                            break label;
                        }
                        char[] row = rows.get(yCoord).toCharArray();
                        if (row[xCoord] == '#') {
                            System.out.println("Stop");
                            break label;
                        } else {
                            System.out.println(yCoord + " " + xCoord);
                            direction = "S";
                        }
                    }
                    case "W" -> {
                        yCoord -= 1;
                        if (yCoord < 0) {
                            System.out.println("Stop");
                            break label;
                        }
                        char[] row = rows.get(yCoord).toCharArray();
                        if (row[xCoord] == '#') {
                            System.out.println("Stop");
                            break label;
                        } else {
                            System.out.println(yCoord + " " + xCoord);
                            direction = "N";
                        }
                    }
                }
            }
        }
    }
}
