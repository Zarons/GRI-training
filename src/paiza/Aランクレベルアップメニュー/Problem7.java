package paiza.Aランクレベルアップメニュー;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//座標系での移動・方角
public class Problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int yCoord = sc.nextInt();
        int xCoord = sc.nextInt();
        int totalMoves = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < totalMoves; i++) {
            String moveInput = sc.nextLine();
            switch (moveInput) {
                case "N" -> yCoord -= 1;
                case "S" -> yCoord += 1;
                case "W" -> xCoord -= 1;
                case "E" -> xCoord += 1;
            }
            System.out.println(yCoord + " " + xCoord);
        }
    }
}
