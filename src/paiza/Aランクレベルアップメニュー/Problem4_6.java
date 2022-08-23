package paiza.Aランクレベルアップメニュー;

import java.util.Scanner;

//FINAL 陣取りゲーム
public class Problem4_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sy = sc.nextInt();
        int sx = sc.nextInt();
        sc.nextLine();

        char firstChar = sc.next().charAt(0); // スタート char を決める（A / B）
        char secondChar = firstChar == 'A' ? 'B' : 'A';
        char firstTempChar = firstChar == 'A' ? 'a' : 'b'; // 操作を交互に繰り返すため
        char secondTempChar = firstChar == 'A' ? 'b' : 'a';
        sc.nextLine();

        char[][] map = new char[sy][sx]; // 二次元配列
        for (int row = 0; row < sy; row++) {
            map[row] = sc.nextLine().toCharArray();
        }

        int checkedFirstChar = 0;
        int countAddedFirstChar = 0;
        int newlyAddedFirstChar = 1; //最初の firstChar は必ず1個ある
        int checkedSecondChar = 0;
        int countAddedSecondChar = 0;
        int newlyAddedSecondChar = 1; //最初の secondChar は必ず1個ある
        for (int i = 0; i < sy * sx; i++) { // 全部の座標を確認する
            firstCharLoop:
            for (int row = 0; row < sy; row++) {  // firstCharを見つけるまでループする
                if (String.valueOf(map[row]).indexOf(firstChar) != -1) { // もっと早い？
                    for (int col = 0; col < sx; col++) { // 1列を確認する
                        if (map[row][col] == firstChar) {
                            map[row][col] = 'X';
                            checkedFirstChar += 1;
                            if (col + 1 < sx && map[row][col + 1] != '#' && map[row][col + 1] == '.') { // 右の表座を確認する
                                map[row][col + 1] = firstTempChar;
                                countAddedFirstChar += 1;
                            }
                            if (col - 1 >= 0 && map[row][col - 1] != '#' && map[row][col - 1] == '.') { // 左の表座を確認する
                                map[row][col - 1] = firstTempChar;
                                countAddedFirstChar += 1;
                            }
                            if (row - 1 >= 0 && map[row - 1][col] != '#' && map[row - 1][col] == '.') { // 上の表座を確認する
                                map[row - 1][col] = firstTempChar;
                                countAddedFirstChar += 1;
                            }
                            if (row + 1 < sy && map[row + 1][col] != '#' && map[row + 1][col] == '.') { // 下の表座を確認する
                                map[row + 1][col] = firstTempChar;
                                countAddedFirstChar += 1;
                            }
                            if (checkedFirstChar == newlyAddedFirstChar) {
                                newlyAddedFirstChar = countAddedFirstChar;
                                checkedFirstChar = 0;
                                countAddedFirstChar = 0;
                                break firstCharLoop;
                            }
                        }
                    }
                }
            }
            secondCharLoop:
            for (int row = 0; row < sy; row++) { // firstCharを見つけたら、secondCharを探す
                if (String.valueOf(map[row]).indexOf(secondChar) != -1) {
                    for (int col = 0; col < sx; col++) {
                        if (map[row][col] == secondChar) {
                            map[row][col] = 'Y';
                            checkedSecondChar += 1;
                            if (col + 1 < sx && map[row][col + 1] != '#' && map[row][col + 1] == '.') { // 右の表座を確認する
                                map[row][col + 1] = secondTempChar;
                                countAddedSecondChar += 1;
                            }
                            if (col - 1 >= 0 && map[row][col - 1] != '#' && map[row][col - 1] == '.') { // 左の表座を確認する
                                map[row][col - 1] = secondTempChar;
                                countAddedSecondChar += 1;
                            }
                            if (row - 1 >= 0 && map[row - 1][col] != '#' && map[row - 1][col] == '.') { // 上の表座を確認する
                                map[row - 1][col] = secondTempChar;
                                countAddedSecondChar += 1;
                            }
                            if (row + 1 < sy && map[row + 1][col] != '#' && map[row + 1][col] == '.') { // 下の表座を確認する
                                map[row + 1][col] = secondTempChar;
                                countAddedSecondChar += 1;
                            }
                            if (checkedSecondChar == newlyAddedSecondChar) {
                                newlyAddedSecondChar = countAddedSecondChar;
                                checkedSecondChar = 0;
                                countAddedSecondChar = 0;
                                break secondCharLoop;
                            }
                        }
                    }
                }
            }
            boolean noMoreValidMoves = true;
            for (int row = 0; row < sy; row++) { // firstCharとsecondCharの上下左右を確認したら、TempCharを変更する
                if (String.valueOf(map[row]).indexOf('a') != -1 || String.valueOf(map[row]).indexOf('b') != -1) {
                    noMoreValidMoves = false;
                    for (int col = 0; col < sx; col++) {
                        if (map[row][col] == 'a') map[row][col] = 'A';
                        if (map[row][col] == 'b') map[row][col] = 'B';
                    }
                }
            }

//            System.out.println("==============");
//            for (int row = 0; row < sy; row++) {
//                System.out.println(map[row]);
//            }

            if (noMoreValidMoves) break;
        }

        for (int row = 0; row < sy; row++) { // firstCharとsecondCharの上下左右を確認したら、TempCharを変更する
            for (int col = 0; col < sx; col++) {
                if (map[row][col] == 'X' || map[row][col] == firstTempChar ) map[row][col] = firstChar;
                if (map[row][col] == 'Y' || map[row][col] == secondTempChar ) map[row][col] = secondChar;
            }
        }

//        System.out.println("==============");
//        for (int row = 0; row < sy; row++) {
//            System.out.println(map[row]);
//        }

        int countA = 0;
        int countB = 0;
        for (int row = 0; row < sy; row++) { // 2次元配列の最終状態を調べる
            for (int col = 0; col < sx; col++) {
                if (map[row][col] == 'A') countA++; // A・B charを数える
                if (map[row][col] == 'B') countB++;
            }
        }
        String winner = countA > countB ? "A" : "B"; // 勝者を決める
        System.out.println(countA + " " + countB);
        System.out.println(winner);
    }
}
