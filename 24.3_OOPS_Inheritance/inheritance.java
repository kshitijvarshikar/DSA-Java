// Inheritance - one class gets properties of another class

class Shape { // Base Class (Parent) - Class whose properties are inherited
    String color;
    public void printInfo() {
        System.out.println(this.color);
    }
}
class Triangle extends Shape { // Subclass (Child) - Class that inherits properties using extends
   
}

    // THERE ARE FOUR TYPES OF INHERITANCE IN JAVA ARE AS FOLLOWES :-

    //1st Single-Level Inheritance
    // class Shape {
    //     String color;
    //     public void area() {
    //         System.out.println("Display area");
    //     }
    // }
    // class Triangle extends Shape {
    //     public void area(int l, int h) {
    //         System.out.println(1 / 2 * l * h);
    //     }
    // }


    //2nd Multi-Level Inheritance
    // class Shape {
    //     String color;
    //     public void area() {
    //         System.out.println("Display area");
    //     }
    // }
    // class Triangle extends Shape {
    //     public void area(int l, int h) {
    //         System.out.println(1 / 2 * l * h);
    //     }
    // }
    // class EquilateralTriangle extends Triangle {
    //     public void area(int l, int h) {
    //         System.out.println(1 / 2 * l * h);
    //     }
    // }


    // 3rd Hierarchial Inheritance
    // class Shape {
    //     String color;
    //     public void area() {
    //         System.out.println("Display area");
    //     }
    // }
    // class Triangle extends Shape {
    //     public void area(int l, int h) {
    //         System.out.println(1 / 2 * l * h);
    //     }
    // }
    // class Circle extends Shape {
    //     public void area(int r) {
    //         System.out.println(3.14 * r * r);
    //     }
    // }


    // 4th Hybrid Inheritance - Hybrid inheritance is a combination of simple, multiple inheritance and hierarchical inheritance. 


    // 5th Multiple Inheritance :- java doest not support multiple inheritance in class but java is modern language so we used interfaces

    public class inheritance {
        public static void main(String[] args) {
            Triangle t1 = new Triangle();
            t1.color = "red";
        }
}
