import java.util.*;

class Loops {
    public static void main(String[] args) {

        // FOR LOOP
        // for(int i=0; i<100; i++){
        // System.out.println("Hello World");
        // }

        // Qs.Print the number from 0 to 10 using for loop
        // for(int i=0; i<11; i++){
        // System.out.print(i+" ");
        // }


        // WHILE LOOP
        // int i = 0;
        // while (i<11) {
        // System.out.print(i+" ");
        // i++; // i = i + 1
        // }


        // DO WHILE LOOP
        // int i = 0;
        // do{
        // System.out.print(i+" ");
        // i++;
        // }while(i<11);

        
        // DIFFERENCE BETWEEN WHILE AND DO WHILE LOOP

        // In While Loop Conditon is false that's Why Not Print Anything
        // int i = 12 ; //false condition for both loops

        // while(i<11){ //Print Nothing
        // System.out.print(i+" ");
        // i++;
        // }

        // In Do While Loop, is Print Atleast One Time Before Checking Condition
        // do{ //Print Atleast Once
        // System.err.print(i+" ");
        // i++;
        // }while(i<11);

        // QS. Print the Sum Of First n Natural Numbers.
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter n : ");
        // int n = sc.nextInt();

        // int sum = 0;
        // for(int i=1; i<=n; i++){
        // sum = sum + i;
        // }
        // System.out.println(sum);

        // QS. Print the Table of a Number input by the User.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(n * i);
        }

    }
}

// NOTE : Avoid Infinite Loops