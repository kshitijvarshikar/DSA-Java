import java.util.*;

class manipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //GET BIT OPERATION
        // int n = 5; // 0101 -->
        //     // pos is 3210
        // int pos = 4;
        // int bitmask = 1 << pos;

        // if ((bitmask & n) == 0) {
        //     System.out.println("bit was zero");
        // } else {
        //     System.out.println("bit was non-zero");
        // }


        //SET BIT OPERATION
        // int n = 8; // 1000 -->
        // int pos = 2;
        // int bitmask = 1 << pos;

        // int newNumber = bitmask | n;
        // System.out.println(newNumber);


        //CLEAR BIT OPERATION
        // int n = 5; // 0101 -->
        // int pos = 2;
        // int bitmask = 1 << pos;
        // int notBitmask = ~(bitmask);

        // int newNumber = notBitmask | n;
        // System.out.println(newNumber);


        //UPDATE BIT OPERATION
        System.out.print("Enter Operation : ");
        int oper = sc.nextInt();

        int n = 5; // 0101 -->
        int pos = 1;

        int bitmask = 1 << pos;

        if(oper==1){
            //set
            int newNumber = bitmask | n;
            System.out.println(newNumber);
        } else{
            int newBitmask = ~(bitmask);
            int newNumber = newBitmask & n;
            System.out.println(newNumber);
        }
    }
}