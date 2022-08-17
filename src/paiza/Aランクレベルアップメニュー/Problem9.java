package paiza.Aランクレベルアップメニュー;

import java.util.Scanner;

//座標系での規則的な移動
public class Problem9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] initializers = sc.nextLine().split(" ");
        int xCoord = Integer.parseInt(initializers[0]);
        int yCoord = Integer.parseInt(initializers[1]);
        int maxMoveCount = Integer.parseInt(initializers[2]);

        char[] direction = {'E', 'S', 'W', 'N'};
        final int maxDirIndex = direction.length;
        int curDirIndex = 0;

        int currentMove = 0;
        int maxMoveBeforeTurning = 1;
        int countTurning = 0;

        for (int i = 0; i < maxMoveCount; i++) {
            currentMove++;
            switch (direction[curDirIndex]) {
                case 'E' -> xCoord += 1;
                case 'S' -> yCoord += 1;
                case 'W' -> xCoord -= 1;
                case 'N' -> yCoord -= 1;
            }

            if (currentMove >= maxMoveBeforeTurning) {
                curDirIndex++;
                if (curDirIndex >= maxDirIndex) {
                    curDirIndex = 0;
                }

                currentMove = 0;
                countTurning++;
            }

            if (countTurning >= 2) {
                maxMoveBeforeTurning++;
                countTurning = 0;
            }
        }
        System.out.println(xCoord + " " + yCoord);
    }
}
