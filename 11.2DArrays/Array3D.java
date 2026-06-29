
public class Array3D {
    public static void main(String[] args) {

        // Jagged Array
        int nums[][] = new int[3][];

        nums[0] = new int[3]; // 3 columns
        nums[1] = new int[4]; // 4 columns
        nums[2] = new int[2]; // 2 columns

        // Assign random values
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = (int)(Math.random() * 10);
            }
        }

        // Print the array
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}
// A jagged array is a multidimensional array where each row can have a different number of columns.