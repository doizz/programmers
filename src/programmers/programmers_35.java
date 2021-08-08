package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

	/*
	 * 프로그래머스 LEVEL_1 정수 내림차순으로 배치하기.
	 */
public class programmers_35 {

	public static void main(String[] args) {
		long n = 118372;
		// long타입을 String 타입으로 변환한다.
		String s = String.valueOf(n);
		//한자씩 char배열에 담는다.
		char[] c = s.toCharArray();
		//오름차순 정렬을 시킨다.
		Arrays.sort(c);
		//역순정렬을 하여 값을 구한다.
		s = new StringBuilder(new String(c)).reverse().toString();
		//String타입을 다시 반환타입인 long으로 변환한다.
		long answer = Long.parseLong(s);
		System.out.println(s);

	}

}
