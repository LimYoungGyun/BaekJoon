package step03;

import java.util.Scanner;

public class Quiz_10871 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int index = scan.nextInt();
		int number = scan.nextInt();
		
		int[] arr = new int[index];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < number) {
				System.out.print(arr[i] + " ");
			}
		}
		
		scan.close();

	}

}
