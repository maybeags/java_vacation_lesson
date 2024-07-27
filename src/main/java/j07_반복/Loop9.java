package j07_반복;

public class Loop9 {
    public static void main(String[] args) {
        /*

         *
         **
         ***
         ****
         *****
         ****
         ***
         **
         *

         */
        int n = 5;

        // 증가하는 패턴 출력
        for( int i = 1 ; i <= n; i++ ) {
            for( int j = 1 ; j <= i ; j++ ) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 감소하는 패턴 출력
        for( int i = n - 1 ; i >= 1 ; i-- ) {
            for( int j = 1 ; j <= i; j++ ) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
