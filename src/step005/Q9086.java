package step005;

import java.util.Scanner;

/**
 * @author : lim
 * @description :
 * @since : 24. 12. 11.(수) 00:14
 */
public class Q9086 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		String[][] str = new String[T][2];
		for (int i = 0; i < T; i++) {
			String M = sc.next();

			str[i][0] = String.valueOf(M.charAt(0));
			str[i][1] = String.valueOf(M.charAt(M.length() - 1));
		}
		for (int i = 0; i < T; i++) {
			System.out.print(str[i][0]);
			System.out.println(str[i][1]);
		}
	}
}
