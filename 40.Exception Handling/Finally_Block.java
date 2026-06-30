
public class Finally_Block {
    public static void main(String[] args) {
        int a[] = new int[5];

        System.out.println("Hello Guys");

        try {
            // System.out.println(a[3]);
            System.out.println(a[8]);
        } 
        catch (Exception e) {
            System.out.println("Exception Handling");
        }
        // we use only one finally block & it will run always but in some case like system.exit() etc cases finally is not work
        finally {
            System.out.println("I Will Always Run...");
        }

        System.out.println("Bye Bye");
    }
}
