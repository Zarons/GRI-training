package paiza.Aランクレベルアップメニュー;

import java.util.Scanner;

// FINAL 区間の積
public class Problem6_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalNumbers = sc.nextInt();
        long goal = sc.nextLong();
        sc.nextLine();

        long[] numArray = new long[totalNumbers];
        for (int i = 0; i < totalNumbers; i++) {
            numArray[i] = sc.nextInt();
        }

        long ans = Integer.MAX_VALUE;
        int startIndex = 0;
        int endIndex = 1;
        long sum = numArray[0];
        while (true) {
            if (startIndex == totalNumbers) break;
            else if (endIndex == startIndex) endIndex++;
            else if (goal <= sum) {
                ans = Math.min(ans, endIndex - startIndex);
                sum /= numArray[startIndex];
                startIndex++;
            } else {
                if (endIndex == totalNumbers) break;
                else if (numArray[endIndex - 1] == 0) {
                    int add = 1;
                    startIndex = endIndex;

                    while (startIndex < totalNumbers && numArray[startIndex] == 0) {
                        startIndex = endIndex + add;
                        add++;
                    }
                    if (startIndex == totalNumbers) break;
                    endIndex = startIndex + 1;
                    sum = numArray[startIndex];
                } else {
                    sum *= numArray[endIndex];
                    endIndex++;
                }
            }
        }
        System.out.println(ans == Integer.MAX_VALUE ? 0 : ans);
    }
}

//    int add = 1;
//                    startIndex = endIndex;
//
//                            while (startIndex < totalNumbers && numArray[endIndex] == 0) {
//        startIndex = endIndex + add;
//        add++;
//        }
//        if (startIndex == totalNumbers) break;
//        endIndex = startIndex + 1;
//        sum = numArray[startIndex];
