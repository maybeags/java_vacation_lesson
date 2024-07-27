package j09_클래스;

public class ProductMain {
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.showInfo();

        Product p2 = new Product(10000);
        p2.showInfo();

        Product p3 = new Product("텀블러");
        p3.showInfo();

        Product p4 = new Product(3000, "아메리카노");
        p4.showInfo();
    }
}
