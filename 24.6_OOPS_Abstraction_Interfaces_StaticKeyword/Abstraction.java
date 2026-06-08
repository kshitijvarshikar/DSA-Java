abstract class Parent {
    public Parent() {
        System.out.println("Im Constructor");
    }

    public void sayHello() {
        System.out.println("Hello");
    }

    // Abstract ka Object nhi banta hai,
    // abstract ek esi class hai jiski help lekar our classes(object) banegi.
    abstract public void greet();
}

class Child extends Parent {
    // OverRide
    // Using Abstract Create More class
    public void greet() {
        System.out.println("Good Morning");
    }
}

public class Abstraction {
    public static void main(String[] args) {

        // its shows an error, Object nhi ban skta because Abstract ka Object nhi banta
        // hai
        // Parent p = new Parent();

        Child c = new Child(); // Using Abstract we create new classes(object).

    }
}

// NOTE :-
// Q.What Does Abstract (class) mean?
// Ans : Abstract in english means -> existing in thought or as an idea without
// concrete existence.