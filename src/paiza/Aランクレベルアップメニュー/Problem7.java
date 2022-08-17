package paiza.Aランクレベルアップメニュー;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//座標系での移動・方角
public class Problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] initializers = sc.nextLine().split(" ");
        int yCoord = Integer.parseInt(initializers[0]);
        int xCoord = Integer.parseInt(initializers[1]);
        int moveCount = Integer.parseInt(initializers[2]);

        String moveSequence = "";
        for (int i = 0; i < moveCount; i++) {
            moveSequence += sc.nextLine();
        }

        for (int i = 0; i < moveCount; i++) {
            switch (moveSequence.charAt(i)) {
                case 'N' -> yCoord -= 1;
                case 'S' -> yCoord += 1;
                case 'W' -> xCoord -= 1;
                case 'E' -> xCoord += 1;
            }
            System.out.println(yCoord + " " + xCoord);
        }
    }
}
