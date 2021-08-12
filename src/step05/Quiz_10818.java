package step05;

import java.util.Scanner;

public class Quiz_10818 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int number = scan.nextInt();
		int[] arr = new int[number];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		int max = arr[0];
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		
		System.out.print(min + " " + max);
		
		scan.close();

	}

}
