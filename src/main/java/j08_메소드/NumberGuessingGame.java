package j08_메소드;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        boolean playAgain = true;    // 참 거짓 판별

        while (playAgain) {

            int chance = 10;
            int attemptsLeft = 0;

            System.out.println("난이도를 선택하세요: 1. 쉬움 / 2. 어려움");
            int difficulty = scanner.nextInt();

            // 1 ~ 100의 임의의 정수를 생성
            // 난이도를 선택 - scanner.nextInt()를 1 쉬움 / 2 어려움
            // 쉬움 난이도 일시에 attemptsLeft = 10
            // 어려움 난이도 일시에 attemptsLeft = 5
            // 1, 2 이외의 다른 숫자 입력시에 "잘못된 선택입니다. 기본적으로 쉬움 모드로 설정됩니다."
            // !의 의미 : 값 반전
            // 게임이 끝났을 때(정답 맞춘 후 혹은 기회 소진 후, "다시 하시겠습니까? yes / no"로 받아서 재시작 가능하게




        }

       scanner.close();
    }
}
