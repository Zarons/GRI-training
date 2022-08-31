package paiza.Aランクレベルアップメニュー;

import java.util.Scanner;

// STEP: 5 区間への足し算
public class Problem6_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalNumbers = sc.nextInt();
        int totalInput = sc.nextInt();
        sc.nextLine();

        int[] numArray = new int[totalNumbers];
        for (int i = 0; i < totalNumbers; i++) {
            numArray[i] = sc.nextInt();
        }

        for (int input = 0; input < totalInput; input++) {
            int startIndex = sc.nextInt() - 1;
            int endIndex = sc.nextInt() - 1;
            int num = sc.nextInt();

            for (int i = startIndex; i <= endIndex; i++) {
                numArray[i] += num;
            }
        }

        for (int el : numArray) {
            System.out.println(el);
        }
    }
}

//10 5
//1 2 3 4 5 6 7 8 9 10
//1 6 10
//8 10 5
//2 8 3
//3 7 -5
//3 6 1

//1 2 3 4 5 6 7 8 9 10;
//
//11 12 13 14 15 16 7 8 9 10;
//11 12 13 14 15 16 7 13 14 15;
//11 15 16 17 18 19 10 16 14 15;
//11 15 11 12 13 14 5 16 14 15;
//11 15 12 13 14 15 5 16 14 15;