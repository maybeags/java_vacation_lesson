package j10_접근지정자;

public class StudentAccessModifierMain {
    public static void main(String[] args) {
        StudentAccessModifier sam = new StudentAccessModifier(20240708, "안근수");
        System.out.println(sam.getCode());
        sam.setCode(20240709);

        System.out.println(sam.getCode());

        sam.setName("안근순");
        System.out.println(sam.getName());

        sam.showInfo();

    }
}
