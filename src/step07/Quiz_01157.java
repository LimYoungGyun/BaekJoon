package step07;

import java.util.Scanner;

public class Quiz_01157 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String words = scan.next();
		words = words.toUpperCase();
		
		int[] cnt = new int[26];
		
		for (int i = 0; i < words.length(); i++) {
			int index = words.charAt(i)-'A'; // 배열의 번호
			cnt[index]++;
		}
		
		// 최대값 구하기
		int max = cnt[0];
		int max_index = 0;
		for (int i = 0; i < cnt.length; i++) {
			if (max < cnt[i]) {
				max = cnt[i];
				max_index = i;
			}
		}
		
		// 최대값이랑 같은 cnt가 있는지 확인하고 분기 처리하기
		for (int i = 0; i < cnt.length; i++) {
			if (i == max_index) {
				continue;
			}
			if (max == cnt[i]) {
				System.out.println("?");
				return;
			}
		}
		
		System.out.println((char)(max_index + 'A'));
		
		scan.close();
	}

}
