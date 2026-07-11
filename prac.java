// constructor and their types

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

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(Student std2) {
        this.name = std2.name;
        this.age = std2.age;
    }

    Student() {

    }
}

public class prac {
    public static void main(String[] args) {

        Student std1 = new Student();
        std1.name = "kshitij";
        std1.age = 21;
        std1.printInfo();

        Student std2 = new Student(std1);
        std2.printInfo();

    }
}