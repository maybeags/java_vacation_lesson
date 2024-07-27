package j14_참조자료형캐스팅.동물;

public class Dog extends Animal{
    @Override
    public void makeSound() {
        System.out.println("강아지가 짖습니다.");
    }

    public void fetch() {
        System.out.println("강아지가 공을 물어 옵니다.");
    }
}
