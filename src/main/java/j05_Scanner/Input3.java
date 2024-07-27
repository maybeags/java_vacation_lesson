package j05_Scanner;

import java.util.Scanner;

public class Input3 {
    public static void main(String[] args) {
        /*
            이름: 안근수                name
            나이: 37                   age
            주소: 부산광역시 연제구      address
            연락처: 010-7445-7113      phone

            사용자의 이름은 안근수고 나이는 37입니다.
            주소는 부산광역시 연제구이며 연락처는 010-7445-7113입니다.

            next()와 nextLine()의 차이점 :
            1. 입력 단위: next()는 공백 이전까지의 단어를 읽고, nextLine()은 줄바꿈 이전까지의 전체 문자열을 읽는다.
            2. 작동 방식 : next()는 공백 문자를 기준으로 입력을 분리하고, nextLine()은 Enter키를 기준으로 입력을 분리한다.
            3. 1, 2로 인한 문제점 : next() 다음에 nextLine()을 혼합하여 쓰게 됐을 때, nextLine()을 호출하기 전에 next()를 사용하면, next()를 입력하고 난 후에 친
                Enter키로 인해 nextLine()이 입력을 무시하고 다음 코드라인으로 넘어가면서 빈 문자열만 저장될 수 있다.
         */
        Scanner scanner = new Scanner(System.in);

        String name = null;
        int age = 0;
        String address = null;
        String phone = null;

        System.out.println("이름: ");

        name = scanner.next();
        System.out.println("나이: ");
        age = scanner.nextInt();
        System.out.println("주소: ");
        scanner.next();                     // nextLine()을 쓰기 전에 Enter키가 먹는 것을 방지하기 위한 방패막
        address = scanner.nextLine();
        System.out.println("연락처: ");
        phone = scanner.nextLine();

        System.out.println("사용자의 이름은 " + name + "이고 나이는 " + age + "입니다.");
        System.out.println("주소는 " + address + "이며 연락처는 " + phone + "입니다.");


    }
}
