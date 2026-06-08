class Array {
    public static void main(String[] args) {

        // int marks[] = new int[3]; //--> 1st way
        // marks[0] = 97; // phy
        // marks[1] = 98; // math
        // marks[2] = 99; // eng

        int marks[] = { 97, 98, 99 }; // --> 2nd way

        // System.out.println(marks); //[I@251a69d7 --> print any random location
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]); //OR

        for (int i = 0; i < 3; i++) {
            System.out.println(marks[i]);
        }

    }
}