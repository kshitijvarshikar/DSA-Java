// classes and objects

import java.util.*;

class Pen {
    String color;
    String type;

    public void write() {
        System.out.println("Writing Something");
    }

    public void getProperty() {
        System.out.println(this.color);
        System.out.println(this.type);
    }
}

class Student {
    String name;
    int age;

    // public void cons() {
    // System.out.println("Constructor Here");
    // }

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class prac {
    public static void main(String[] args) {
        // Pen pen1 = new Pen();
        // pen1.color = "black";
        // pen1.type = "ball";
        // pen1.write();

        // Pen pen2 = new Pen();
        // pen2.color = "blue";
        // pen2.type = "gel";
        // pen2.write();

        // pen1.getProperty();
        // pen2.getProperty();

        Student std1 = new Student();
        std1.name = "kshitij";
        std1.age = 21;
        // std1.cons();
        std1.printInfo();

    }
}