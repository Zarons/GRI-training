package paiza.Aランクレベルアップメニュー;

import java.math.BigInteger;
import java.util.Scanner;

// STEP: 2 べき乗の計算
public class Problem7_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger exponent = sc.nextBigInteger();
        BigInteger base = BigInteger.valueOf(2);
        BigInteger modulus = BigInteger.valueOf(1000003);
        BigInteger result = base.modPow(exponent, modulus);
        System.out.println(result);
    }
}
