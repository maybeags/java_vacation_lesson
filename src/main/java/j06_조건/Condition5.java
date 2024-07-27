package j06_조건;

import java.util.Scanner;

public class Condition5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int score = 0;

        System.out.println("점수를 입력하세요 >>> ");
        score = scanner.nextInt();
//        int changed_score = score / 10;
//        System.out.println(changed_score);

        if(score < 0 || score > 100) {
            System.out.println("X");
        } else {
            switch ( score / 10 ) {
                case 10:
                case 9:
                    System.out.println("A학점");
                    break;
                case 8:
                    System.out.println("B학점");
                    break;
                case 7:
                    System.out.println("C학점");
                    break;
                case 6:
                    System.out.println("D학점");
                    break;
                default:
                    System.out.println("F학점");
            }
        }
        System.out.println("프로그램 종료");
    }
}
