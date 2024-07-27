package j03_형변환;

public class Conversion {
    public static void main(String[] args) {
        // upcasting(업캐스팅)
        char cast1 = 'a';
        System.out.println((int) cast1); // 첫번째 방법
        System.out.println(cast1);
        int cast2 = cast1;              // 두번째 방법
        System.out.println(cast2);

        //downcasting(다운캐스팅)
        int cast3 = 98;
        System.out.println(cast3);
        char cast4 = (char) cast3;
        System.out.println(cast4);

    }
}
