package paiza.Aランクレベルアップメニュー;

import java.math.BigInteger;
import java.util.Scanner;

// STEP: 3 素数判定
public class Problem7_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        BigInteger number = new BigInteger(input);
        System.out.println(number.isProbablePrime(1) ? "YES" : "NO");
    }
}
