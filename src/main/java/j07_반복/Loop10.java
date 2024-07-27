package j07_반복;

public class Loop10 {
    public static void main(String[] args) {
        /*
                    *
                   **
                  ***
                 ****
         */
        int n = 4;

        for ( int i = 1 ; i <= n ; i++) {       // 각 줄에 대한 반복
            // 공백 출력 반복
            for ( int j = n ; j > i; j-- ) {
                System.out.print(" ");
            }
            // 별 출력 반복
            for ( int k = 1; k <= i ; k++ ) {
                System.out.print("*");
            }
            // 줄 바꿈
            System.out.println();
        }
    }
}
