package _00_Intro_To_Arrays;

import java.util.Random;

public class _01_IntroToArrays {
    public static void main(String[] args) {
        // 1. declare and Initialize an array 5 Strings
    	Random r = new Random();
    	String[] s = new String[5];
    	System.out.println("Test " + r.nextInt(2));
    	s[0]="first";
    	s[1]="second";
    	s[2]="third";
    	s[3]="fourth";
    	s[4]="fifth";
        // 2. print the third element in the array
    	System.out.println(s[2]);
    	System.out.println();
        // 3. set the third element to a different value
    	s[2]="changed";
        // 4. print the third element again
    	System.out.println(s[2]);
    	System.out.println();
        // 5. use a for loop to set all the elements in the array to a string
        //    of your choice
    	for(int i = 0; i < s.length; i++) {
    		s[i]="changed all";
    	}
        // 6. use a for loop to print all the values in the array
        //    BE SURE TO USE THE ARRAY'S length VARIABLE
    	for(int i = 0; i < s.length; i++) {
    		System.out.println(s[i]);
    	}
        // 7. make an array of 50 integers
    	int[] i = new int[50];
        // 8. use a for loop to make every value of the integer array a random
        //    number
    	int smallest = 0;
    	for(int o = 0; o < i.length; o++) {
    		i[o] = r.nextInt(50);
    		if(o==0) {
    			smallest = i[o];
    			continue;
    		}
    		else {
    			if(smallest>i[o]) {
    				smallest = i[o];
    			}
    		}
    	}
        // 9. without printing the entire array, print only the smallest number
        //    on the array
    	System.out.println(smallest+"\n");
        // 10 print the entire array to see if step 8 was correct
    	for(int o = 0; o < i.length; o++) {
    		System.out.println(i[o]);
    	}
        // 11. print the largest number in the array.
    	int biggest = 0;
    	for(int o = 0; o < i.length; o++) {
    		i[o] = r.nextInt(50);
    		if(o==0) {
    			biggest = i[o];
    			continue;
    		}
    		else {
    			if(biggest<i[o]) {
    				biggest = i[o];
    			}
    		}
    	}
    	System.out.println(biggest+"\n");
    	for(int o = 0; o < i.length; o++) {
    		System.out.println(i[o]);
    	}
        // 12. print only the last element in the array
    	System.out.println("\n"+i[i.length-1]);
    }
}
