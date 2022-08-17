package paiza.Aランクレベルアップメニュー;

import java.util.Scanner;

//座標系での移動・向き
public class Problem8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] initializers = sc.nextLine().split(" ");
        int yCoord = Integer.parseInt(initializers[0]);
        int xCoord = Integer.parseInt(initializers[1]);
        String direction = initializers[2];

        String turn = sc.nextLine();
        if (turn.equals("R")) {
            switch (direction) {
                case "N" -> System.out.println(yCoord + " " + (xCoord + 1));
                case "S" -> System.out.println(yCoord + " " + (xCoord - 1));
                case "E" -> System.out.println((yCoord + 1) + " " + xCoord);
                case "W" -> System.out.println((yCoord - 1) + " " + xCoord);
            }
        } else if (turn.equals("L")) {
            switch (direction) {
                case "N" -> System.out.println(yCoord + " " + (xCoord - 1));
                case "S" -> System.out.println(yCoord + " " + (xCoord + 1));
                case "E" -> System.out.println((yCoord - 1) + " " + xCoord);
                case "W" -> System.out.println((yCoord + 1) + " " + xCoord);
            }
        }
    }
}
