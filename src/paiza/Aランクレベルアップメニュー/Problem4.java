package paiza.Aランクレベルアップメニュー;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//マップの判定・縦
public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] initializers = sc.nextLine().split(" ");
        int h = Integer.parseInt(initializers[0]);
        int w = Integer.parseInt(initializers[1]);

        Map<Integer, String> rows = new HashMap<>();
        for (int i = 0; i < h; i++) {
            String input = sc.nextLine();
            rows.put(i, input);
        }

        for (int i = 0; i < h; i++) {
            if (i == 0) {
                char[] botArray = rows.get(1).toCharArray();
                for (int j = 0; j < w; j++) {
                    if (botArray[j] == '#') {
                        System.out.println(0 + " " + j);
                    }
                }
            } else if (i == h - 1) {
                char[] topArray = rows.get(i - 1).toCharArray();
                for (int j = 0; j < w; j++) {
                    if (topArray[j] == '#') {
                        System.out.println(i + " " + j);
                    }
                }
            } else if (i > 0 && i < h - 1) {
                char[] topArray = rows.get(i - 1).toCharArray();
                char[] botArray = rows.get(i + 1).toCharArray();
                for (int j = 0; j < w; j++) {
                    if (topArray[j] == '#' && botArray[j] == '#') {
                        System.out.println(i + " " + j);
                    }
                }
            }
        }
    }
}
