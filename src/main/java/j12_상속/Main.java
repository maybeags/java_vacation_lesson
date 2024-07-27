package j12_상속;

public class Main {
    public static void main(String[] args) {
        Tiger tiger = new Tiger("나비");

        tiger.move();

        System.out.println("호랑이의 이름은 " + tiger.getName() + "입니다.");
        tiger.setName("티거");
        System.out.println("호랑이의 이름은 " + tiger.getName() + "입니다.");

        Human human = new Human("안근수");
        // 특정 클래스에서 객체를 생성하게 되면 생성자가 한 번 호출된다.
        // 그 증거로 생성자를 명시적으로 사용하지 않았음에도 "Animal 생성"이 출력됨.

        human.move();

        System.out.println("사람의 이름은 " + human.getName() + "입니다." );
        human.setName("안근순");
        System.out.println("사람의 이름은 " + human.getName() + "입니다." );
    }
}
