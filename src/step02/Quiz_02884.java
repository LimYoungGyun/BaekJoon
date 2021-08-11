package step02;

import java.util.Scanner;

public class Quiz_02884 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int H = scan.nextInt();
		int M = scan.nextInt();
		
		if ((H >= 0 && H <= 24) || (M >= 0 && M <= 60)) {
			M = M - 45;
			if(M < 0) {
				H -= 1;
				if(H < 0) {
					H = 23;
				}
				M = M + 60;
				System.out.println(H + " " + M);
			} else {
				System.out.println(H + " " + M);
			}
		}
		
		scan.close();
	}

}
