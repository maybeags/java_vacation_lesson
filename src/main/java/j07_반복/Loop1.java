package j07_반복;

public class Loop1 {
    public static void main(String[] args) {
        int result = 0;
        /*
            for(시작값; 한계값; 증감값) {
                실행문
            }
         */
//        for(int i = 1; i < 101; i++) {
//            result += i;
//        }
//        System.out.println(result);
        for (int i = 0; i < 100; i++) {
            result += i + 1;
        }

        System.out.println("1 ~ 100까지 더한 값: " + result);
    }
}
