package j07_반복;

import java.util.Scanner;

public class Loop2 {
    public static void main(String[] args) {
        /*
            예제
            n에 숫자를 입력하여 몇 번 반복할지 정하고 1부터 n까지 더하는 반복문을 작성하시오.

            실행 예
            몇번 반복할지 입력하세요 >>> 10
            합은 5050입니다.
         */

        Scanner scanner = new Scanner(System.in);
        int n = 0;
        System.out.println("몇 번 반복할지 입력하세요 >>> ");
        n = scanner.nextInt();
//        int result = 0;
//        for(int i = 0; i < n; i++) {
//            result += i + 1;
//        }
//        System.out.println("합은 " + result + "입니다.");
        for(int i = 0; i < n ; i++) {
            System.out.println("i: " + (i+1));
        }
        System.out.println();
        System.out.println();
        for(int i = 0; i < n; i++) {
            System.out.println("i: " + (n-i));
        }
    }
}
