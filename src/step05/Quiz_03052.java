package step05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz_03052 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++ ) {
			arr[i] = arr[i] % 42;
		}

		List<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {
			if (list.contains(arr[i])) {
				continue;
			} else {
				list.add(arr[i]);
			}
		}
		System.out.println(list.size());
		
		scan.close();

	}

}
