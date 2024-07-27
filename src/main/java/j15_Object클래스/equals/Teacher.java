package j15_Object클래스.equals;

import java.util.Objects;

public class Teacher {

    private String name;
    private String schoolName;

    public Teacher(String name, String schoolName) {
        this.name = name;
        this.schoolName = schoolName;
    }

    // equals()는 주로 문자열끼리 동일한지를 확인하기 위한 용도로 String 클래스에서 많이 쓰지만 해당 메소드 역시
    // Object 클래스에서 overriding 받은 것이다.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // 실행문이 한 줄 밖에 없기 때문에 {}를 쓰지 않고 바로 이어서 작성함.
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;      // 다운캐스팅
        return Objects.equals(name, teacher.name) && Objects.equals(schoolName, teacher.schoolName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, schoolName);
    }
}
