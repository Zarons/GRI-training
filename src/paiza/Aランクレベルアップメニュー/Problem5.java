package paiza.Aランクレベルアップメニュー;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//マップの判定・縦横
public class Problem5 {
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
                char[] topArray = rows.get(i).toCharArray();
                char[] botArray = rows.get(i + 1).toCharArray();
                for (int j = 0; j < w; j++) {
                    if (j == 0) {
                        if (topArray[j + 1] == '#' && botArray[j] == '#') {
                            System.out.println(i + " " + j);
                        }
                    } else if (j == w - 1) {
                        if (topArray[j - 1] == '#' && botArray[j] == '#') {
                            System.out.println(i + " " + j);
                        }
                    } else {
                        if (topArray[j - 1] == '#' && topArray[j + 1] == '#' && botArray[j] == '#') {
                            System.out.println(i + " " + j);
                        }
                    }
                }
            } else if (i == h - 1) {
                char[] botArray = rows.get(i).toCharArray();
                char[] topArray = rows.get(i - 1).toCharArray();
                for (int j = 0; j < w; j++) {
                    if (j == 0) {
                        if (botArray[j + 1] == '#' && topArray[j] == '#') {
                            System.out.println(i + " " + j);
                        }
                    } else if (j == w - 1) {
                        if (botArray[j - 1] == '#' && topArray[j] == '#') {
                            System.out.println(i + " " + j);
                        }
                    } else {
                        if (botArray[j - 1] == '#' && botArray[j + 1] == '#' && topArray[j] == '#') {
                            System.out.println(i + " " + j);
                        }
                    }
                }
            } else {
                char[] topArray = rows.get(i - 1).toCharArray();
                char[] midArray = rows.get(i).toCharArray();
                char[] botArray = rows.get(i + 1).toCharArray();
                for (int j = 0; j < w; j++) {
                    if (j == 0) {
                        if (midArray[j + 1] == '#' && topArray[j] == '#' && botArray[j] == '#') {
                            System.out.println(i + " " + j);
                        }
                    } else if (j == w - 1) {
                        if (midArray[j - 1] == '#' && topArray[j] == '#' && botArray[j] == '#') {
                            System.out.println(i + " " + j);
                        }
                    } else {
                        if (midArray[j - 1] == '#' && midArray[j + 1] == '#' && topArray[j] == '#' && botArray[j] == '#') {
                            System.out.println(i + " " + j);
                        }
                    }
                }
            }
        }
    }
}
