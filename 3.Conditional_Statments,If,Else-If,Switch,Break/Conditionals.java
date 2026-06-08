import java.util.*;

class Conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // IF-ELSE
        // QS.1 Check Person is Adult Or Not ?
        // System.out.print("Enter Age : ");
        // int age = sc.nextInt();

        // if (age>=18) {
        // System.out.println("Adult");
        // } else {
        // System.out.println("Not Adult");
        // }

        // Qs.2 Check Number Is Even Or Odd ?
        // System.out.print("Enter Number : ");
        // int num = sc.nextInt();

        // if (num%2==0) {
        // System.out.println("Number is Even");
        // } else {
        // System.out.println("Number is Odd");
        // }


        // ELSE-IF
        // Qs.3 Take 2 user input
        // 1) a=b, equal
        // 2) a>b, a is greather
        // 3) a<b, a is lesser
        // System.out.print("Enter a : ");
        // int a = sc.nextInt();
        // System.out.print("Enter b : ");
        // int b = sc.nextInt();

        // if (a==b) {
        // System.out.println("equal");
        // } else if (a>b){
        // System.out.println("a is greather");
        // } else {
        // System.out.println("a is lesser");
        // }

        // Qs.4 Button
        // button 1 = Hello
        // button 2 = namaste
        // button 3 = bonjour --> spanish hey
        // button except 1,2,3 = invalid button
        // System.out.print("Enter Button : ");
        // int button = sc.nextInt();

        // if (button==1) {
        // System.out.println("Hello");
        // }
        // else if (button==2){
        // System.out.println("Namaste");
        // }
        // else if (button==3){
        // System.out.println("Bonjour");
        // }
        // else{
        // System.out.println("Invalid Button");
        // }

        
        // SWITCH
        // Qs.5 Button
        // button 1 = Hello
        // button 2 = namaste
        // button 3 = bonjour --> spanish hey
        // button except 1,2,3 = invalid button
        System.out.print("Enter Button : ");
        int button = sc.nextInt();

        switch (button) {
            case 1:
                System.out.println("Hello");
                break;

            case 2:
                System.out.println("Namaste");
                break;

            case 3:
                System.out.println("Bonjour");
                break;

            default:
                System.out.println("Invalid Button");
        }
    }
}
