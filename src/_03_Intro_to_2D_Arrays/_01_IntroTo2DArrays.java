package _03_Intro_to_2D_Arrays;

public class _01_IntroTo2DArrays {

    public static void main(String[] args) {
        // 1. declare a 2D array of integers with 3, 1D arrays that each hold
        //    3 integers
    	int[][] array2D = { {0,0,0},{0,0,0},{0,0,0} };
        // 2. use two for loops to set all the elements in the 2D array to
        //    a different integer
        //    BE SURE TO USE THE ARRAY'S length VARIABLE
    	int ints = 0;
        for(int i = 0; i < array2D.length;i++) {
        	for(int o = 0; o < 3; o++) {
        		array2D[i][o] = ints;
        		ints++;
        	}
        }
        // 3. print the third element from the second 1D array (2DArray[1][2])
        System.out.println(array2D[1][2]);
        // 4. set the third element from the second 1D array to a different
        //    value
        array2D[1][2] = 9;
        // 5. print the element again and verify the value has changed
        System.out.println(array2D[1][2]);
    }
}
