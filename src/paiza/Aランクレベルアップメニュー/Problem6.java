package paiza.Aランクレベルアップメニュー;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//マップからの座標取得
public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] initializers = sc.nextLine().split(" ");
        int height = Integer.parseInt(initializers[0]);
        int width = Integer.parseInt(initializers[1]);

        Map<Integer, String> rows = new HashMap<>();
        for (int i = 0; i < height; i++) {
            String input = sc.nextLine();
            rows.put(i, input);
        }

        for (int i = 0; i < height; i++) {
            char[] array = rows.get(i).toCharArray();
            for (int j = 0; j < width; j++) {
                if (array[j] == '#') {
                    System.out.println(i + " " + j);
                }
            }
        }
    }
}
