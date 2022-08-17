package paiza.Aランクレベルアップメニュー;

import java.util.*;

//盤面の情報取得
public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] initializers = sc.nextLine().split(" ");
        int h = Integer.parseInt(initializers[0]);
        int w = Integer.parseInt(initializers[1]);
        int n = Integer.parseInt(initializers[2]);

        Map<Integer, String> rows = new HashMap<>();
        for (int i = 0; i < h; i++) {
            String input = sc.nextLine();
            rows.put(i, input);
        }

        Map<Integer, String> searchCoord = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split(" ");
            String coordX = input[0];
            String coordY = input[1];
            searchCoord.put(i, coordX + coordY);
        }

//        System.out.println(rows);
//        System.out.println(searchCoord);

        for (int i = 0; i < n; i++) {
            String coord = searchCoord.get(i);
            int coordX = Integer.parseInt(String.valueOf(coord.charAt(0)));
            int coordY = Integer.parseInt(String.valueOf(coord.charAt(1)));

//            System.out.println("XY ->" + coord);
//            System.out.println("X ->" + coordX);
//            System.out.println("Y ->" + coordY);

            System.out.println(rows.get(coordX).charAt(coordY));
        }
    }
}
