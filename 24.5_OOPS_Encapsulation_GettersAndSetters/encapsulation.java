//Encapsulation is the process of wrapping data (variables) and code (methods) into a single unit (class) 

class Employee {
    private int id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public void setId(int i) {
        this.id = i;
    }

    public int getId() {
        return id;
    }
}

public class encapsulation {
    public static void main(String[] args) {
        Employee em = new Employee();
        // em.id = 45;
        // em.name = "kshitij"; --> Throws an error due to private access

        // modifier
        em.setName("kshitij");
        System.out.println(em.getName());
        em.setId(234);
        System.out.println(em.getId());
    }
}
