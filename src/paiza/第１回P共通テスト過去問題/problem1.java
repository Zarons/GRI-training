package paiza.第１回P共通テスト過去問題;

import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cost = sc.nextInt();
        int money = sc.nextInt();
        int result = money - cost;

        System.out.println(result < 0 ? "Tarimasen!" : result);
    }
}
