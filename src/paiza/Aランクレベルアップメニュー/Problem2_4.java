package paiza.Aランクレベルアップメニュー;

import java.util.*;

//座標系での規則的な移動
public class Problem2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int xCoord = sc.nextInt();
        int yCoord = sc.nextInt();
        int maxMoveCount = sc.nextInt();

        char[] direction = {'E', 'S', 'W', 'N'};
        int currentDirection = 0;
        int currentMove = 0;
        int maxMoveBeforeTurning = 1;
        int turned = 0;
        for (int i = 0; i < maxMoveCount; i++) {
            switch (direction[currentDirection % 4]) {
                case 'E' -> xCoord += 1;
                case 'S' -> yCoord += 1;
                case 'W' -> xCoord -= 1;
                case 'N' -> yCoord -= 1;
            }
            currentMove++;
            if (currentMove >= maxMoveBeforeTurning) {
                currentMove = 0;
                currentDirection++;
                turned++;
            }
            if (turned >= 2) {
                maxMoveBeforeTurning++;
                turned = 0;
            }
        }
        System.out.println(xCoord + " " + yCoord);
    }
}
