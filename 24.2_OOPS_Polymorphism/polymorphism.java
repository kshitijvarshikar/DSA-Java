// poly --> boht jyada (many)
// morphism ---> tarike (Forms)
// polymorphism --> 1 task perform in many forms

class Student3 {
    String name;
    int age;
    
    // 1st Compile Time Polymorphism (Static) -- Method OverLoading
    // Method overloading = same method name but different inputs or parameters
    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int age) {
        System.out.println(age);
    }
    
    public void printInfo(String name, int age) {
        System.out.println(name + " " + age);
    }
}

class polymorphism {
    public static void main(String[] args) {

        // 1st Compile Time Polymorphism (Static) -- Method OverLoading
        Student3 s1 = new Student3();
        s1.name = "Kshitij";
        s1.age = 20;
        // System.out.println(s1.name);
        // System.out.println(s1.age);
        s1.printInfo(s1.name, s1.age);
    }
}


//2nd Runtime Polymorphism (Dhynamic)