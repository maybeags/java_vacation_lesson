package j16_Bean;

import java.util.Objects;

public class UserEntity {

    /*
        정보를 담는 객체를 Entity Class라고 한다.
        멤버 변수 -> 명사 name, address
        메소드 -> 동사

        멤버 변수 선언
        생성자를 정의
        Getters and Setters 정의
        Equals and HashCode 정의
        toString  정의
     */

    // 멤버 변수 선언
    private String username;
    private String password;
    private String email;
    private String name;

    // 생성자 정의
    //  기본 생성자
    public UserEntity() {}
    // 매개변수 생성자
    public UserEntity(String username, String password, String email, String name) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.name = name;
    }

    //setter 메서드 정의

    //  setUsername
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter 정의

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        UserEntity that = (UserEntity) o;
        return Objects.equals(username, that.username) && Objects.equals(password, that.password) && Objects.equals(email, that.email) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password, email, name);
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                '}';
    }


}
