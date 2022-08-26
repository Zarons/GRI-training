package paiza.Aランクレベルアップメニュー;

import java.util.Scanner;
import java.util.ArrayList;
import java.awt.Point;

//FINAL 陣取りゲーム
public class Problem4_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sy = sc.nextInt();
        int sx = sc.nextInt();
        sc.nextLine();
        char char1 = sc.next().charAt(0); // スタート char を決める（A / B）
        char char2 = char1 == 'A' ? 'B' : 'A';
        sc.nextLine();

        char[][] map = new char[sy][sx]; // 二次元配列
        for (int row = 0; row < sy; row++) {
            map[row] = sc.nextLine().toCharArray();
        }

        ArrayList<Point> checkList1 = new ArrayList<>(); // 先攻用
        findStartingCoord(sy, sx, char1, map, checkList1);
        ArrayList<Point> newCoordList1 = new ArrayList<>(); // 後攻用
        boolean checkList1IsEmpty = false;

        ArrayList<Point> checkList2 = new ArrayList<>(); // 先攻用
        findStartingCoord(sy, sx, char2, map, checkList2);
        ArrayList<Point> newCoordList2 = new ArrayList<>(); // 後攻用
        boolean checkList2IsEmpty = false;

        while (!checkList1IsEmpty || !checkList2IsEmpty) {
            int i = 0;
            while (i < checkList1.size()) {
                Point currentCoord = checkList1.get(i);
                int row = (int) currentCoord.getY();
                int col = (int) currentCoord.getX();
                checkNorth(row, col, 0, char1, map, newCoordList1);
                checkEast(row, col, sx, char1, map, newCoordList1);
                checkSouth(row, col, sy, char1, map, newCoordList1);
                checkWest(row, col, 0, char1, map, newCoordList1);
                if (i == checkList1.size() - 1 && newCoordList1.isEmpty()) { // empty list1
                    checkList1.subList(0, checkList1.size()).clear();
                    checkList1IsEmpty = true;
                    break;
                } else if (i < checkList1.size() - 1) {
                    i++;
                } else if (i == checkList1.size() - 1 && !newCoordList1.isEmpty()) {
                    renewCheckList(checkList1, newCoordList1);
                    break;
                }
            }

            int j = 0;
            while (j < checkList2.size()) {
                Point currentCoord = checkList2.get(j);
                int row = (int) currentCoord.getY();
                int col = (int) currentCoord.getX();
                checkNorth(row, col, 0, char2, map, newCoordList2);
                checkEast(row, col, sx, char2, map, newCoordList2);
                checkSouth(row, col, sy, char2, map, newCoordList2);
                checkWest(row, col, 0, char2, map, newCoordList2);
                if (j == checkList2.size() - 1 && newCoordList2.isEmpty()) { // empty list1
                    checkList2.subList(0, checkList2.size()).clear();
                    checkList2IsEmpty = true;
                    break;
                } else if (j < checkList2.size() - 1) {
                    j++;
                } else if (j == checkList2.size() - 1 && !newCoordList2.isEmpty()) {
                    renewCheckList(checkList2, newCoordList2);
                    break;
                }
            }
        }

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

    public static void findStartingCoord(int sy, int sx, char inputChar, char[][] map, ArrayList<Point> list) {
        for (int row = 0; row < sy; row++) {
            if (String.valueOf(map[row]).indexOf(inputChar) != -1) {
                for (int col = 0; col < sx; col++) {
                    if (map[row][col] == inputChar) {
                        Point point = new Point(col, row);
                        list.add(point);
                    }
                }
            }
        }
    }

    public static void checkNorth(int row, int col, int northLimit, char inputChar, char[][] map, ArrayList<Point> newList) {
        if (row - 1 >= northLimit && map[row - 1][col] != '#' && map[row - 1][col] == '.') { // 上の表座を確認する
            map[row - 1][col] = inputChar;
            Point point = new Point(col, row - 1);
            newList.add(point);
        }
    }

    public static void checkSouth(int row, int col, int southLimit, char inputChar, char[][] map, ArrayList<Point> newList) {
        if (row + 1 < southLimit && map[row + 1][col] != '#' && map[row + 1][col] == '.') { // 下の表座を確認する
            map[row + 1][col] = inputChar;
            Point point = new Point(col, row + 1);
            newList.add(point);
        }
    }

    public static void checkEast(int row, int col, int eastLimit, char inputChar, char[][] map, ArrayList<Point> newList) {
        if (col + 1 < eastLimit && map[row][col + 1] != '#' && map[row][col + 1] == '.') { // 右の表座を確認する
            map[row][col + 1] = inputChar;
            Point point = new Point(col + 1, row);
            newList.add(point);
        }
    }

    public static void checkWest(int row, int col, int westLimit, char inputChar, char[][] map, ArrayList<Point> newList) {
        if (col - 1 >= westLimit && map[row][col - 1] != '#' && map[row][col - 1] == '.') { // 左の表座を確認する
            map[row][col - 1] = inputChar;
            Point point = new Point(col - 1, row);
            newList.add(point);
        }
    }

    public static void renewCheckList (ArrayList<Point> checkList, ArrayList<Point> newList) {
        checkList.subList(0, checkList.size()).clear();
        checkList.addAll(newList);
        newList.subList(0, newList.size()).clear();
    }
}
