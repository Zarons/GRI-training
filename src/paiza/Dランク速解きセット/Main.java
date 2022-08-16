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

////【早解10】ボーダー柄
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        for (int i = 0; i < num; i++) {
//            System.out.println("##########");
//            System.out.println("..........");
//        }
//    }
//}

////【早解11】縦書き
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String line = sc.nextLine();
//        for (int i = 0; i < line.length(); i++) {
//            System.out.println(line.charAt(i));
//        }
//    }
//}

////【早解12】山の英語表記
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String line = sc.nextLine();
//        System.out.println("Mt. " + line);
//    }
//}

////【早解13】満員電車の乗車率
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        double num = sc.nextDouble();
//        System.out.println((int) (num / 140 * 100) + "%");
//    }
//}

////【早解14】0から9までのカウンタ
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        for (int i = num; i < num + 10; i++) {
//            if (i >= 10) {
//                System.out.println(i - 10);
//            } else {
//                System.out.println(i);
//            }
//        }
//    }
//}

////【早解15】気温の変化
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String[] line = sc.nextLine().split(" ");
//        int num1 = Integer.parseInt(line[0]);
//        int num2 = Integer.parseInt(line[1]);
//        if (num2 > num1) {
//            System.out.println("+" + (num2 - num1));
//        } else if (num2 == num1) {
//            System.out.println(0);
//        } else {
//            System.out.println(num2 - num1);
//        }
//    }
//}

////【早解16】アルファベットの穴の数
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String chr = sc.nextLine();
//        String group1 = "A, D, O, P, Q, R";
//        String group2 = "B";
//
//        if (group2.contains(chr)) {
//            System.out.println(2);
//        } else if (group1.contains(chr)) {
//            System.out.println(1);
//        } else {
//            System.out.println(0);
//        }
//    }
//}

////【早解17】騒音レベル
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int db = sc.nextInt();
//
//        if (db < 30) {
//            System.out.println("quiet");
//        } else if (db < 50) {
//            System.out.println("normal");
//        } else if (db < 70) {
//            System.out.println("noisy");
//        } else {
//            System.out.println("very noisy");
//        }
//    }
//}

//【早解18】TGIF
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        if (line.equals("Friday")) {
            System.out.println("TGIF");
        } else {
            System.out.println("Still " + line);
        }
    }
}