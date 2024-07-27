package j12_상속;

public class Human extends Animal {

    public Human(String humanName) {
        super(humanName);
        System.out.println("근데 사람입니다.");
    }

    /*
        메소드 오버라이딩(overriding / override)
        [ 재정의 ]
        상위(Animal) 객체의 메소드를 하위(Human) 객체에서 다시 정의하는 행위
     */

    @Override // @(어노테이션 annotation) : 해당 메소드가 상위 객체로부터 재정의된 메소드란 것을 명시
    public void move() {
        super.move();
        System.out.println("두 발로 걷습니다.");
    }
}
