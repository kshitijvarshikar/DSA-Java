//Constructor and its 3 types

//Class
class Student2 {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // 1st Non-Parametrized Constructor
    Student2() { // No-Parameters
        System.out.println("constructor called");
    }

    // 2nd Parametrized Constructor
    Student2(String name, int age) { // Parameters
        this.name = name;
        this.age = age;
    }

    // 3rd Copy Constructors
    Student2(Student2 s2) {
        this.name = s2.name;
        this.age = s2.age;
    }

}

// Object
public class constructor {
    public static void main(String[] args) {

        // 1st Non-Parametrized Constructor
        // Student2 s1 = new Student2(); // Student() :- Constructor -- 3 Types Of
        // constructor we have
        // s1.name = "Kshitij";
        // s1.age = "21";
        // s1.printInfo();

        // 2nd Parametrized Constructor
        // Student s1 = new Student("Kshitij", "24");
        // s1.printInfo();

        // 3rd Copy Constructors
        Student2 s1 = new Student2();
        s1.name = "Kshitij";
        s1.age = 20;
        s1.printInfo();

        Student2 s2 = new Student2(s1);
        s2.printInfo();

    }
}
