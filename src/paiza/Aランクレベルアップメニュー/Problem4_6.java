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
        char char1 = sc.next().charAt(0); // スタートcharを決める（A / B）
        char char2 = char1 == 'A' ? 'B' : 'A';
        sc.nextLine();

        char[][] map = new char[sy][sx]; // 二次元配列
        for (int row = 0; row < sy; row++) {
            map[row] = sc.nextLine().toCharArray();
        }

        ArrayList<Point> checkList1 = findStartingCoord(sy, sx, char1, map);
        ArrayList<Point> checkList2 = findStartingCoord(sy, sx, char2, map);

        while (checkList1.size() + checkList2.size() > 0) {
            checkList1 = checkAllSide(sy, sx, char1, map, checkList1); // こちらは checkList1 = newCoordList1
            checkList2 = checkAllSide(sy, sx, char2, map, checkList2); // こちらは checkList2 = newCoordList2
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
        System.out.println(countA > countB ? "A" : "B"); // 勝者を決める
    }

    public static ArrayList<Point> findStartingCoord(int sy, int sx, char inputChar, char[][] map) {
        ArrayList<Point> checkList = new ArrayList<>();
        for (int row = 0; row < sy; row++) {
            if (String.valueOf(map[row]).indexOf(inputChar) != -1) {
                for (int col = 0; col < sx; col++) {
                    if (map[row][col] == inputChar) checkList.add(new Point(col, row));
                }
            }
        }
        return checkList;
    }

    public static void checkSide(int row, int col, int sx, int sy, char inputChar, char[][] map, ArrayList<Point> newCoordList) {
        if (row >= 0 && row < sx && col >= 0 && col < sy && map[row][col] != '#' && map[row][col] == '.') {
            map[row][col] = inputChar;
            newCoordList.add(new Point(col, row));
        }
    }

    public static ArrayList<Point> checkAllSide(int sy, int sx, char inputChar, char[][] map, ArrayList<Point> checkList) {
        ArrayList<Point> newCoordList = new ArrayList<>();
        for (Point p: checkList) {
            int row = (int) p.getY();
            int col = (int) p.getX();
            checkSide(row - 1, col, sy, sx, inputChar, map, newCoordList); // 北側
            checkSide(row, col + 1, sy, sx, inputChar, map, newCoordList); // 東側
            checkSide(row + 1, col, sy, sx, inputChar, map, newCoordList); // 南側
            checkSide(row, col - 1, sy, sx, inputChar, map, newCoordList); // 西側
        }
        return newCoordList;
    }
}
