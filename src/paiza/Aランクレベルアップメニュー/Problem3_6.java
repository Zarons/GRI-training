package paiza.Aランクレベルアップメニュー;

import java.util.Scanner;

//時刻に伴う移動
public class Problem3_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int width = sc.nextInt();
        int sy = sc.nextInt();
        int sx = sc.nextInt();
        int totalInput = sc.nextInt();
        sc.nextLine();

        char[][] map = new char[height][width]; // create 2D array map
        for (int row = 0; row < height; row++) { // input value to 2D array map
            map[row] = sc.nextLine().toCharArray();
        }

        String[] directions = {"N", "E", "S", "W"};
        int curDir = 0; // starting direction is N
        int round = 0;
        loop:
        for (int input = 1; input <= totalInput; input++) { // input loop
            int turnRound = sc.nextInt(); // first arg -> turn during x round
            String turn = sc.next(); // second arg -> turn x direction

            while (round <= 99) { // check total round
                if (round < turnRound) { // if it's NOT the round to turn x direction
                    switch (directions[curDir % 4]) {
                        case "N" -> sy -= 1;
                        case "E" -> sx += 1;
                        case "S" -> sy += 1;
                        case "W" -> sx -= 1;
                    }
                    if (sx < 0 || sx >= width || sy < 0 || sy >= height || map[sy][sx] == '#') { // 例外 check
                        System.out.println("Stop");
                        break loop;
                    }
                    System.out.println(sy + " " + sx); // print new coord going +1
                    round++;
                } else { // if it's the round to turn x direction
                    curDir += turn.equals("R") ? 1 : 3; // change direction
                    switch (directions[curDir % 4]) { // move +1 in the new direction
                        case "N" -> sy -= 1;
                        case "E" -> sx += 1;
                        case "S" -> sy += 1;
                        case "W" -> sx -= 1;
                    }
                    if (sx < 0 || sx >= width || sy < 0 || sy >= height || map[sy][sx] == '#') { // 例外 check
                        System.out.println("Stop");
                        break loop;
                    }
                    System.out.println(sy + " " + sx); // print new coord after turning
                    round++;
                    break; // quit while loop to get new input after turning
                }
            }
        }
    }
}
