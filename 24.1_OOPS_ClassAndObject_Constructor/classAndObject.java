//Class & Object

//Class

//1st Example
class Pen {
    String color;
    String type;

    // Function which is present inside class is called as method
    public void writing() {
        System.out.println("Writing Something");
    }

    public void printColor() {
        System.out.println("The Color of this Pen is " + this.color); // Using "this" keyword we get color
    }
}

// 2nd Example
class Student1 {
    String name;
    String age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

}

// Object
public class classAndObject {
    // Main
    public static void main(String[] args) {

        // 1st Example
        // Pen p1 = new Pen();
        // p1.color = "Blue";
        // p1.type = "Gel";

        // Pen p2 = new Pen();
        // p2.color = "Black";
        // p2.type = "BallPoint";

        // Pen p3 = new Pen();
        // p3.color = "Red";
        // p3.type = "BallPoint";

        // p1.writing();
        // p1.printColor();
        // p2.printColor();
        // p3.printColor();

        // 2nd Example
        Student1 s1 = new Student1(); // Student() :- Constructor -- 3 Types Of constructor we have
        s1.name = "Kshitij";
        s1.age = "21";

        Student1 s2 = new Student1();
        s2.name = "Arpita";
        s2.age = "20";

        s1.printInfo();
        s2.printInfo();

    }
}
