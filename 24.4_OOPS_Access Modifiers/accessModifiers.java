class C1 {
    // 4 TYPE OF ACCESS MODIFIERS
    public int x = 5;
    protected int y = 45;
    int z = 6;
    private int a = 78;

    public void meth1() {
        // IN SAME CLASS WE ACCESS ALL 4 ACCESS MODIFIERS
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}

class C2 extends C1 {
    void meth2() {
        // IN SUBCLASS WE ACCESS ALL 3 ACCESS MODIFIERS EXCEPT PRIVATE
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        // System.out.println(a); // a has private access so aap istemal nhi kar skte
    }
}

public class accessModifiers {
    public static void main(String[] args) {
        C1 c1 = new C1();
        // c1.meth1();

        C2 c2 = new C2();
        c2.meth2();

        // IN SAME PACKAGE WE ACCESS ALL 3 ACCESS MODIFIERS EXCEPT PRIVATE
        // System.out.println(c1.x);
        // System.out.println(c1.y);
        // System.out.println(c1.z);
        // System.out.println(c1.a); // a has private access so aap istemal nhi kar skte
    }
}

// NOTE :- IN WORLD, WE ACCESS ONLY PUBLIC WHICH IS BY DEFAULT BUILD-IN JAVA
// (like..import java.util.*;)