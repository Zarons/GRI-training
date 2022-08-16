package paiza.paizaの森練習問題コンテスト過去問題1;

import java.util.*;

////スポーツの人数
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String line = sc.nextLine();
//        switch (line) {
//            case "baseball" -> System.out.println(9);
//            case "soccer" -> System.out.println(11);
//            case "rugby" -> System.out.println(15);
//            case "basketball" -> System.out.println(5);
//            case "volleyball" -> System.out.println(6);
//        }
//    }
//}

////バイトの休憩時間
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int hour = sc.nextInt();
//        if (hour <= 6) {
//            System.out.println("no break");
//        } else if (hour <= 8) {
//            System.out.println("45 min");
//        } else {
//            System.out.println("60 min");
//        }
//    }
//}

////自動車の燃費
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String[] line = sc.nextLine().split(" ");
//        int fuel = Integer.parseInt(line[0]);
//        int distance = Integer.parseInt(line[1]);
//        System.out.println(distance / fuel);
//    }
//}

//背番号順
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        Map<Integer, String> players = new HashMap<>();
        for(int i = 0; i < num; i++) {
            String[] input = sc.nextLine().split(" ");
            players.put(Integer.parseInt(input[0]), input[1]);
        }

        TreeMap<Integer, String> sortedPlayers = new TreeMap<>(players);
        for (Map.Entry<Integer, String> player : sortedPlayers.entrySet())
            System.out.println(player.getKey() + " " + player.getValue());
    }
}
