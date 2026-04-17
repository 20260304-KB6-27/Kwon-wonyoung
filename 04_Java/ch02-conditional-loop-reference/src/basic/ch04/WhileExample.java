package basic.ch04;

import java.util.Scanner;

public class WhileExample {
    public static void main(String[] args) {

        // while(조건) { 반복될 코드 }
        Scanner scanner = new Scanner(System.in);   // 키보드와 Scanner 연결

        int speed = 0;
        boolean run = false;

//        while (run) {
//            System.out.println("1. 증속 | 2. 감속 | 3. 중지");
//            System.out.print("선택 : ");
//            String strNum = scanner.nextLine(); // 키보드에서 입력한 내용을 읽음
//
//            if (strNum.equals("1")) {
//                speed++;
//                System.out.println("현재속도 : " + speed);
//            } else if (strNum.equals("2")) {
//                speed--;
//                System.out.println("현재속도 : " + speed);
//            } else {
//                run = false;
//            }
//        }

        do {
            System.out.println("1. 증속 | 2. 감속 | 3. 중지");
            System.out.print("선택 : ");
            String strNum = scanner.nextLine(); // 키보드에서 입력한 내용을 읽음

            if (strNum.equals("1")) {
                speed++;
                System.out.println("현재속도 : " + speed);
            } else if (strNum.equals("2")) {
                speed--;
                System.out.println("현재속도 : " + speed);
            } else {
                run = false;
            }
        } while (run);

        System.out.println("프로그램 종료");
    }
}
