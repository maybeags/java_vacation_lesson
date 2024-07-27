package j14_참조자료형캐스팅.동물;

/*
     instanceof 연산자 : Java에서 객체의 실제 타입을 검사하는 데 사용. -> 주로 다운캐스팅의 안전성을 확보하기 위해.
     형식 :
     object instanceof ClassName

     object : 검사라혀는 객체명
     ClassName : 객체가 검사될 클래스나 인터페이스

     반환값은 object가 ClassName의 인스턴스이거나 ClassName의 하위클래스의 인스턴스인 경우 true 반환, 그렇지 않은 경우 false 반환
 */
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();        // Dog 객체 생성
        Animal animal = dog;        // 업캐스팅(Dog -> Animal)

        animal.makeSound();
//        animal.fetch();             // 컴파일 오류 : Animal 클래스에는 fetch() 메소드가 존재하지 않음.


        Animal animal2 = new Dog(); // 업캐스팅 (Dog -> Animal)

        if (animal2 instanceof Dog) {
            Dog dog2 = (Dog) animal2;   // 다운캐스팅 (Animal -> Dog)
            dog2.makeSound();
            dog2.fetch();
        }
    }
}
