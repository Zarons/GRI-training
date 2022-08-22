package paiza.Aランクレベルアップメニュー;

import java.util.*;

//座標系での向きの変わる移動
public class Problem2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int xCoord = sc.nextInt(), yCoord = sc.nextInt(), maxMove = sc.nextInt();
        sc.nextLine();

        char[] direction = {'N', 'E', 'S', 'W'};
        int dirIndex = 0;
        for (int i = 0; i < maxMove; i++) {
            String turn = sc.nextLine();
            if (turn.equals("R")) dirIndex = (1 + dirIndex) % 4;
            else dirIndex = (3 + dirIndex) % 4;

            switch (direction[dirIndex]) {
                case 'N' -> yCoord -= 1;
                case 'E' -> xCoord += 1;
                case 'S' -> yCoord += 1;
                case 'W' -> xCoord -= 1;
            }
            System.out.println(xCoord + " " + yCoord);
        }
    }
}
