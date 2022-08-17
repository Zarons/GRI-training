package paiza.Aランクレベルアップメニュー;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//マップの判定・横
public class Problem3 {
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
            char[] charArray = rows.get(i).toCharArray();

            for (int j = 0; j < w; j++) {
                if (j == 0 && charArray[1] == '#') {
                    System.out.println(i + " " + j);
                } else if (j > 0 && j <= w - 2) {
                    if (charArray[j - 1] == '#' && charArray[j + 1] == '#') {
                        System.out.println(i + " " + j);
                    }
                } else if (j == w - 1 && charArray[j - 1] == '#') {
                    System.out.println(i + " " + j);
                }
            }
        }
    }
}
