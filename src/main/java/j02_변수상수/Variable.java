package j02_변수상수;

public class Variable {
    public static void main(String[] args) {
//        // 변수(variable) : 데이터를 담을 수 있는 바구니
//
//        // 논리 자료형 변수
//        boolean checkFlag = false;
//        //자료형 변수명   =   데이터;
//        System.out.println(checkFlag);
//        checkFlag = true;
////        checkFlag2 = false; -> 오류발생
//        System.out.println(checkFlag);
//
//        // 문자 자료형 변수
//        char name1 = '안';
//        char name2 = '근';
//        char name3 = '수';
//        System.out.println(name1);
//        System.out.println(name2);
//        System.out.println(name3);
//        System.out.println("" + name1 + name2 + name3);
//        System.out.println(name1 + name2 + name3); // -> 주소값 출력
//        System.out.println('가' + 0);
//
//        // 문자열 자료형 변수
//        String name4 = "안근수";
//        System.out.println(name4);
//        String name5 = name4 + ""; // '='의 의미 : 오른쪽의 값을 왼쪽에 대입하겠다
//        System.out.println(name5);

        // 정수 자료형 변수
        int width = 100;
        int width2 = 200;

        String width3 = "300";
        String width4 = "400";

        int widthResult = width + width2;
        String widthResult2 = width3 + width4;

        System.out.println(widthResult);
        System.out.println(widthResult2);

        long time = System.currentTimeMillis();
        System.out.println(time);

        /*
        int (4 바이트, 32 비트)
            최소값: -2,147,483,648 (−2^31)
            최대값: 2,147,483,647 (2^31 − 1)
        long (8 바이트, 64 비트)
            최소값: -9,223,372,036,854,775,808 (−2^63)
            최대값: 9,223,372,036,854,775,807 (2^63 − 1)
         */

        // 실수 자료형 변수
        double pi = 3.14159;
        System.out.println(pi);

        // 상수
        final String FILE_PATH = "C:/Java_vacation";
        System.out.println(FILE_PATH);

    }
}
