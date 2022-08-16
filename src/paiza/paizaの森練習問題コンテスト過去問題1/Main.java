package paiza.paizaの森練習問題コンテスト過去問題1;

import java.util.*;

//スポーツの人数
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        switch (line) {
            case "baseball" -> System.out.println(9);
            case "soccer" -> System.out.println(11);
            case "rugby" -> System.out.println(15);
            case "basketball" -> System.out.println(5);
            case "volleyball" -> System.out.println(6);
        }
    }
}
