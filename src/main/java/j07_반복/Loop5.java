package j07_반복;

public class Loop5 {
    public static void main(String[] args) {

        // 1부터 5까지의 합을 구하는 for 문

//        int total = 0;
//        for(int i = 1; i < 6; i++){
//            total += i;
//        }
//        System.out.println("1부터 5까지의 합 : " + total);

        // 1부터 5까지의 합을 구하는 while 문

        // 반복문 while
        /*
             형식:
             while(조건문) {
                실행문
             }

             for 문은 한계값을 설정하기 때문에 정확한 횟수의 반복을 요구할 때 사용하는 편
             while문은 정확한 횟수의 한계는 모르지만 특정한 조건 하에서의 반복을 요구할 때 사용하는 편
         */

        int total = 0;
        int i = 1;

        while( i <= 5 ) {
            total += i;
            i++;
        }
    }
}
