class Student {
    String name;
    static String school; // Common for all

    public static void changeSchool() {
        school = "newschool";
    }
}

public class staticKeyword {
    public static void main(String[] args) {
        Student.school = "Raisoni";
        Student std = new Student();
        std.name = "Tony";
        System.out.println(Student.school);

    }
}
