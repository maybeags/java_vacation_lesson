package j15_Object클래스;

public class ToString {
    public static void main(String[] args) {

        ObjectTest objectTest = new ObjectTest();
        System.out.println(objectTest.toString());
        System.out.println(objectTest.showInfo());

        ObjectTest objectTest2 = new ObjectTest("안근수", "부산광역시 연제구");
        System.out.println(objectTest2.toString());
        System.out.println(objectTest2.showInfo());

        System.out.println();
        String str = objectTest2.toString();
        System.out.println(str);

        Teacher teacher1 = new Teacher("안근수", "코리아아이티");
        System.out.println(teacher1);

        String teacher1Info = teacher1.toString();
//        System.out.println(teacher1Info);
    }
}
