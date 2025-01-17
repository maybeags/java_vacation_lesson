package j15_Object클래스;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TeacherClassClass {
    public static void main(String[] args) {

        Teacher teacher1 = new Teacher("안근수", "코리아아이티");
        Teacher teacher2 = new Teacher("안근수", "코리아아이티");
        j15_Object클래스.equals.Teacher teacher3 = new j15_Object클래스.equals.Teacher("안근수", "코리아아이티");

        Class t_class = teacher1.getClass();

        System.out.println(t_class.getSimpleName());            // Class명만 출력
        System.out.println(t_class.getName());                  // 패키지명.Class명 출력

        Field[] fields = t_class.getDeclaredFields();
        for(int i = 0; i < fields.length; i++) {
            System.out.println(fields[i].getName());
            System.out.println(fields[i].getType().getSimpleName());
        }


        Method[] methods = t_class.getDeclaredMethods();
        for(int i = 0; i < methods.length ; i++) {
            System.out.println(methods[i].getReturnType());
        }


        System.out.println(teacher1.getClass() == teacher2.getClass());
        System.out.println(teacher1 instanceof Teacher);
        System.out.println();
//        System.out.println(teacher3 instanceof Teacher);
        System.out.println(teacher1.getClass() == Teacher.class);
        System.out.println(teacher2.getClass() == Teacher.class);

    }
}
