package paiza.Aランクレベルアップメニュー;

import java.util.Scanner;

//座標系での向きの変わる移動
public class Problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] initializers = sc.nextLine().split(" ");
        int xCoord = Integer.parseInt(initializers[0]);
        int yCoord = Integer.parseInt(initializers[1]);
        int maxMove = Integer.parseInt(initializers[2]);

        char direction = 'N';
        for (int i = 0; i < maxMove; i++) {
            String turn = sc.nextLine();
            if (turn.equals("R")) {
                switch (direction) {
                    case 'N' -> {
                        xCoord += 1;
                        System.out.println(xCoord + " " + yCoord);
                        direction = 'E';
                    }
                    case 'E' -> {
                        yCoord += 1;
                        System.out.println(xCoord + " " + yCoord);
                        direction = 'S';
                    }
                    case 'S' -> {
                        xCoord -= 1;
                        System.out.println(xCoord + " " + yCoord);
                        direction = 'W';
                    }
                    case 'W' -> {
                        yCoord -= 1;
                        System.out.println(xCoord + " " + yCoord);
                        direction = 'N';
                    }
                }
            } else if (turn.equals("L")) {
                switch (direction) {
                    case 'N' -> {
                        xCoord -= 1;
                        System.out.println(xCoord + " " + yCoord);
                        direction = 'W';
                    }
                    case 'E' -> {
                        yCoord -= 1;
                        System.out.println(xCoord + " " + yCoord);
                        direction = 'N';
                    }
                    case 'S' -> {
                        xCoord += 1;
                        System.out.println(xCoord + " " + yCoord);
                        direction = 'E';
                    }
                    case 'W' -> {
                        yCoord += 1;
                        System.out.println(xCoord + " " + yCoord);
                        direction = 'S';
                    }
                }
            }
        }
    }
}
