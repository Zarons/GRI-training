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

//【早解2】正n角形の内角
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        int result = (180*(num - 2))/num;
        System.out.println(result);
    }
}
