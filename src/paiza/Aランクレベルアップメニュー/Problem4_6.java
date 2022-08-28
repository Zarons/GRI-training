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
        ArrayList<Point> checkList2 = new ArrayList<>(); // 先攻用
        findStartingCoord(sy, sx, char2, map, checkList2);

        while (checkList1.size() + checkList2.size() > 0) {
            ArrayList<Point> newCoordList1 = new ArrayList<>();
            checkAllSide(sy, sx, char1, map, checkList1, newCoordList1);
            ArrayList<Point> newCoordList2 = new ArrayList<>();
            checkAllSide(sy, sx, char2, map, checkList2, newCoordList2);
        }

        int countA = 0;
        int countB = 0;
        for (int row = 0; row < sy; row++) { // 2次元配列の最終状態を調べる
            for (int col = 0; col < sx; col++) {
                if (map[row][col] == 'A') countA++; // A・B charを数える
                if (map[row][col] == 'B') countB++;
            }
        }
        System.out.println(countA + " " + countB);
        System.out.println(countA > countB ? "A" : "B");// 勝者を決める
    }

    public static void findStartingCoord(int sy, int sx, char inputChar, char[][] map, ArrayList<Point> list) {
        for (int row = 0; row < sy; row++) {
            if (String.valueOf(map[row]).indexOf(inputChar) != -1) {
                for (int col = 0; col < sx; col++) {
                    if (map[row][col] == inputChar) list.add(new Point(col, row));
                }
            }
        }
    }

    public static void checkSide(int row, int col, int sx, int sy, char inputChar, char[][] map, ArrayList<Point> newCoordList) {
        if (row >= 0 && row < sx && col >= 0 && col < sy && map[row][col] != '#' && map[row][col] == '.') {
            map[row][col] = inputChar;
            newCoordList.add(new Point(col, row));
        }
    }

    public static void renewCheckList(ArrayList<Point> checkList, ArrayList<Point> newList) {
        checkList.subList(0, checkList.size()).clear();
        checkList.addAll(newList);
        newList.subList(0, newList.size()).clear();
    }

    public static void checkAllSide(int sy, int sx, char inputChar, char[][] map, ArrayList<Point> checkList, ArrayList<Point> newCoordList) {
        int i = 0;
        while (i < checkList.size()) {
            Point currentCoord = checkList.get(i);
            int row = (int) currentCoord.getY();
            int col = (int) currentCoord.getX();
            checkSide(row - 1, col, sy, sx, inputChar, map, newCoordList); // 北側
            checkSide(row, col + 1, sy, sx, inputChar, map, newCoordList); // 東側
            checkSide(row + 1, col, sy, sx, inputChar, map, newCoordList); // 南側
            checkSide(row, col - 1, sy, sx, inputChar, map, newCoordList); // 西側
            if (i == checkList.size() - 1 && newCoordList.isEmpty()) {
                checkList.subList(0, checkList.size()).clear();
                break;
            } else if (i < checkList.size() - 1) {
                i++;
            } else if (i == checkList.size() - 1 && !newCoordList.isEmpty()) {
                renewCheckList(checkList, newCoordList);
                break;
            }
        }
    }
}
