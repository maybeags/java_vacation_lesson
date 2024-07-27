package j06_조건;

import java.util.Scanner;

public class Condition2 {
    public static void main(String[] args) {
        // if - else if 문
        // 형식
        // if(조건문) {
        //  실행문
        //} else if(조건문) {
        //  실행문
        //} else {
        //  실행문
        //}
        Scanner scanner = new Scanner(System.in);

        final int VIP_POINT = 80;
        final int GOLD_POINT = 60;
        final int SILVER_POINT = 40;
        final int BRONZE_POINT = 20;

        int point = 0;
//        String rating = null;
        System.out.println("회원 포인트 점수를 입력하세요. >>> ");
        point = scanner.nextInt();

        if(point > VIP_POINT) {
//            rating = "VIP";
            System.out.println("회원의 등급 : VIP");
        } else if(point > GOLD_POINT) {
//            rating = "GOLD";
            System.out.println("회원의 등급 : GOLD");
        } else if (point > SILVER_POINT) {
//            rating = "SILVER";
            System.out.println("회원의 등급 : SILVER");
        } else if (point > BRONZE_POINT) {
//            rating = "BRONZE";
            System.out.println("회원의 등급 : BRONZE");
        } else {
//            rating = "GENERAL";
            System.out.println("회원의 등급 : GENERAL");
        }

//        System.out.println("회원의 등급: " + rating);

    }
}
