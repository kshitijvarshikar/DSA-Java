// access modifier and getters and setters

import java.util.*;

class Students {
    private String name;
    private int id;

    public String getname() {
        return name;
    }

    public void setname(String n) {
        this.name = n;
    }

    public int getid() {
        return id;
    }

    public void setid(int n) {
        this.id = n;
    }
}

public class prac {
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.setname("kshitij");
        System.out.println(s1.getname());
        s1.setid(03);
        System.out.println(s1.getid());
    }
}