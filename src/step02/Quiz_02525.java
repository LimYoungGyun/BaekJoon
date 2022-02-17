package step02;

import java.util.Scanner;

public class Quiz_02525 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int H = scan.nextInt();
		int M = scan.nextInt();
		int time = scan.nextInt();
		scan.close();
		
		M += time;
		if (M >= 60) {
			H += (M / 60);
			M = M % 60;
		}
		
		if (H >= 24) {
			H = H % 24;
		}
		System.out.println(H + " " + M);
	}

}
