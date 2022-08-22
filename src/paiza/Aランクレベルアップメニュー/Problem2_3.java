package paiza.Aランクレベルアップメニュー;

import java.util.Scanner;

//座標系での移動・向き
public class Problem2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int yCoord = sc.nextInt();
        int xCoord = sc.nextInt();
        String direction = sc.next();
        sc.nextLine();

        String checkTurn = sc.nextLine();
        int turn = checkTurn.equals("R") ? 1 : -1;

        switch (direction) {
            case "N" -> xCoord += turn;
            case "E" -> yCoord += turn;
            case "S" -> xCoord -= turn;
            case "W" -> yCoord -= turn;
        }
        System.out.println(yCoord + " " + xCoord);
    }
}
