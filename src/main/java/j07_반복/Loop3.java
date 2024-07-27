package j07_반복;

public class Loop3 {
    public static void main(String[] args) {
        /*
            중첩 for문
            for(int i = 0 ; i < 10 ; i++){
                for(int j = 0 ; j < 10 ; j++) {
                    실행문
                }
            }
         */
//        int a = 0;
//        int b = 0;
//        for(int i = 0; i < 10 ; i++) {
//            a = i;
//            System.out.println("a의 값 : " + a);
//            for(int j = 0 ; j < 10; j++){
//                b = j;
//                System.out.println("b의 값 : " + b);
//            }
//        }
        /*
            실행 예시
            2 x 1 = 2
            2 x 2 = 4
            ...
            9 x 9 = 81
         */
//        for(int i = 2 ; i < 10 ; i++){
//            for (int j = 1; j < 10; j++){
//                System.out.println(i + " x " + j + " = " + (i*j));
//            }
//        }
        for(int i = 0 ; i < 8 ; i++){
            int dan = i + 2;
            for (int j = 0; j < 9; j++){
                int num  = j + 1;
                System.out.println(dan + " x " + num + " = " + (dan*num));
            }
        }

    }
}
