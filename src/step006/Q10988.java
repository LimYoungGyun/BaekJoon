package step006;

import java.util.Scanner;

/**
 * @author : lim
 * @description : "package" 라인 제외, 출제 번호를 Main으로 변경 후 제출. (채점이 진행되지 않음)
 * @since : 24. 12. 11.(수) 23:57
 */
public class Q10988 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		String[] strs = str.split("");
		StringBuilder sb = new StringBuilder();
		for (int i = strs.length - 1; i >= 0; i--) {
			sb.append(strs[i]);
		}
		String reverseStr = sb.toString();

		if (reverseStr.equals(str)) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}

	}
}
