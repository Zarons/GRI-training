package paiza.Aランクレベルアップメニュー;

import java.math.BigInteger;
import java.util.Scanner;

// FINAl 最大公約数
public class Problem7_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger big1 = sc.nextBigInteger();
        BigInteger big2 = sc.nextBigInteger();
        System.out.println(big1.gcd(big2));
    }
}
