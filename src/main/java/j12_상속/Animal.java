package j12_상속;

public class Animal {

    private String name;

    public Animal(String animalName) {
        System.out.println("Animal 생성");
        this.name = animalName;
    }

    public void move() {
        System.out.println("움직입니다.");
    }

    public String getName() {
        return name;
    }

    public void setName(String animalName) {
        this.name = animalName;
    }
}
