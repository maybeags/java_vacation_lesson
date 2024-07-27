package j08_메소드;

import java.util.Scanner;

public class Method2 {

    /*
        별찍기 메소드 구현
     */
    public static String getStar(int select, int n) {
        String result = "";

        if(select == 1) {
            // 왼쪽으로 치우친 증가하는 별
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < i + 1; j++) {
                    result += "*";
                }
                result += "\n";
            }
        } else if(select == 2) {
            //오른쪽으로 치우친 증가하는 별
            for(int i = 0; i < n; i++) {
                // 공백 삽입
                for(int j = 0; j < n - i -  1; j++) {
                    result += " ";
                }
                for(int k = 0; k < i + 1; k++) {
                    result += "*";
                }
                result += "\n";
            }
        } else if(select == 3) {
            //왼쪽으로 치우친 감소하는 별
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n - i; j++) {
                    result += "*";
                }
                result += "\n";
            }
        } else if(select == 4) {
            //오른쪽으로 치우친 감소하는 별
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < i; j++) {
                    result += " ";
                }
                for(int k = 0; k < n - i; k++) {
                    result += "*";
                }
                result += "\n";
            }
        } else {
            System.out.println("입력 오류입니다!!!");
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 입력
        int rowOfStars = 0;
        int choice = 0;
        System.out.print("별의 줄 수 입력 : ");
        rowOfStars = scanner.nextInt();

        System.out.println("1. 왼쪽으로 치우친 증가하는 별");
        System.out.println("2. 오른쪽으로 치우친 증가하는 별");
        System.out.println("3. 왼쪽으로 치우친 감소하는 별");
        System.out.println("4. 오른쪽으로 치우친 감소하는 별");
        System.out.print("메뉴 선택 : ");
        choice = scanner.nextInt();
        String stars = getStar(choice, rowOfStars);

        System.out.println("[ 결과값 ]");
//        System.out.println(stars);
        System.out.println(getStar(choice, rowOfStars));
    }
}
