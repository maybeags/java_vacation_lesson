package j08_메소드;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingFinal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        boolean playAgain = true;
        while (playAgain) {
            int numberToGuess = random.nextInt(100) + 1;
            int attemptLeft = 0;
            System.out.println(numberToGuess);          // 테스트 코드의 사용
            System.out.print("난이도를 선택하세요: 1. 쉬움 / 2. 어려움 >>> ");
            int difficulty = scanner.nextInt();
            if (difficulty == 1) {
                attemptLeft = 10;
            } else if (difficulty == 2) {
                attemptLeft = 5;
            } else {
                System.out.println("잘못된 선택입니다. 기본적으로 쉬움 모드로 시작합니다.");
                attemptLeft = 10;
            }

            boolean hasGuessedCorrectly = false;
            System.out.println("1부터 100까지의 숫자 중 하나를 선택했습니다. 맞춰보세요!");

            while(!hasGuessedCorrectly && attemptLeft > 0) {               // 정답을 맞추거나 혹은 기회를 다 소모했을 경우 false로 바뀌어야 함
                System.out.print("남은 시도 횟수 : " + attemptLeft + "번. 숫자를 입력하세요. >>> ");
                int userGuess = scanner.nextInt();
                attemptLeft--; // attemptLeft -= 1, attemptLeft = attemptLeft - 1

                if (userGuess == numberToGuess) {
                    System.out.println("정답입니다! 숫자맞추셨습니다.");
                    hasGuessedCorrectly = true;
                } else if (userGuess < numberToGuess) {
                    System.out.println("UP");
                } else {
                    System.out.println("DOWN");
                }
            }
            if(!hasGuessedCorrectly) {
                System.out.println("죄송합니다. 모든 시도를 사용하였습니다. 정답은 " + numberToGuess + "입니다.");
            }
            System.out.print("다시 게임을 시작하시겠습니까? (yes/no) : ");
            scanner.nextLine();             // 방어막 역할
            String playAgainInput = scanner.next();
//            if (playAgainInput.equals("no") || playAgainInput.equals("NO") || playAgainInput.equals("No")) {
//                break;
//            }
            if(playAgainInput.equalsIgnoreCase("no")) {
                playAgain = false;
            }

        }
        System.out.println("게임을 플레이 해주셔서 감사합니다!:)");
        scanner.close();
        /*
                    equals() 메소드
                    Object 클래스
                    String 클래스 : 객체의 내용(문자열 값)이 동일한지를 비교하도록 재정의하는 메소드.
                                    따라서 문자열 비교시에는 equals()를 사용하는 것이 적절하다. '=='써서 틀린 것이었다.
                    equals() 메소드의 응용
                    playAgainInput.equalsIgnoreCase("no")
         */
    }
}
