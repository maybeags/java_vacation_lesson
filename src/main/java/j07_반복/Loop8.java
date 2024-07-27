package j07_반복;

public class Loop8 {
    public static void main(String[] args) {
        // 별찍기

        /*

              *
              **
              ***

              ***
              **
              *
         */
        for (int i = 0 ; i < 5 ; i++) {

            for( int j = 0 ; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        int n = 4;
        for(int i = n; i > 0 ; i--){

            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
