package paiza.Dランク速解きセット;

import java.util.*;


////【早解1】1日1万歩
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine();
//        String[] numbers = input.split(" ");
//        int d = Integer.parseInt(numbers[0]);
//        int s = Integer.parseInt(numbers[1]);
//
//        int result = (d * 100000) / s;
//        if (result >= 10000) {
//            System.out.println("yes");
//        } else {
//            System.out.println("no");
//        }
//    }
//}

////【早解2】正n角形の内角
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = Integer.parseInt(sc.nextLine());
//        int result = (180*(num - 2))/num;
//        System.out.println(result);
//    }
//}

////【早解3】うなりの周波数
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine();
//        String[] numbers = input.split(" ");
//        int f1 = Integer.parseInt(numbers[0]);
//        int f2 = Integer.parseInt(numbers[1]);
//
//        int result = (Math.max(f1, f2) - Math.min(f1, f2));
//        System.out.println(result);
//    }
//}

////【早解4】たぶん...
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String line = sc.nextLine();
//        line = line.substring(0, line.indexOf(", maybe."));
//        System.out.println(line + "!!");
//    }
//}

////【早解5】アンダーライン
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String line = sc.nextLine();
//        System.out.println(line);
//        for (int i = 0; i < line.length(); i++) {
//            System.out.print("^");
//        }
//    }
//}

////【早解6】式の計算
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String[] line = sc.nextLine().split(" ");
//        int num1 = Integer.parseInt(line[0]);
//        int num2 = Integer.parseInt(line[2]);
//        System.out.println(num1 + num2);
//    }
//}

////【早解7】鉛筆の濃さ
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        String[] pencil = {"6B", "5B", "4B", "3B", "2B", "B", "HB", "F", "H", "2H", "3H", "4H", "5H", "6H", "7H", "8H", "9H"};
//        System.out.println(pencil[num - 1]);
//    }
//}

////【早解8】靴のサイズ
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        double num = sc.nextDouble();
//        System.out.println((num - 18) + " " + (num - 18.5));
//    }
//}

////【早解9】30人31脚
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        System.out.println(num + 1);
//    }
//}

//【早解10】ボーダー柄
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println("##########");
            System.out.println("..........");
        }
    }
}
