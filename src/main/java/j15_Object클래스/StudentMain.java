package j15_Object클래스;

public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student("안근수", 20240716);

        System.out.println(student1.toString());

        student1.setName("안근순");
        student1.setStudentId(20240717);

        System.out.println(student1.toString());

        System.out.println();

        System.out.println(student1.getName());
        System.out.println(student1.getStudentId());
    }



}
