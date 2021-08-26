package _01_Simple_Array_Algorithms;

import java.util.Random;

public class MoreArrayFun {
    //1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String[] strings = {"String1","String2","String3"};
		printStrings(strings);
		System.out.println();
		reverseStrings(strings);
		System.out.println();
		everyOther(strings);
		System.out.println();
		randomOrder(strings);
	}


    //2. Write a method that takes an array of Strings and prints all the Strings in the array.
	static void printStrings(String[] strings) {
		for(int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
		}
	}

    //3. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in reverse order.
	static void reverseStrings(String[] strings) {
		for(int i = strings.length-1; i > -1; i--) {
			System.out.println(strings[i]);
		}
	}

    //4. Write a method that takes an array of Strings and prints every other String in the array.
	static void everyOther(String[] strings) {
		int counter = 0;
		for(int i = 0; i < strings.length; i++) {
			if(counter>strings.length) {
				continue;
			}
			else {
				System.out.println(strings[counter]);
				counter+=2;
			}
		}
	}

    //5. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in a completely random order. Almost every run of the program should result in a different order.
	static void randomOrder(String[] strings) {
		Random rand = new Random();
		for (int i = 0; i < strings.length; i++) {
			int toSwap = rand.nextInt(strings.length);
			String temp = strings[toSwap];
			strings[toSwap] = strings[i];
			strings[i] = temp;
		}
		
		for (int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
		}
	}
}
