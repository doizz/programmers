package programmers_level_1;

import java.util.Arrays;
import java.util.Collections;

	/*
	 * 프로그래머스 LEVEL_1 문자열 내림차순으로 배치하기
	 */
public class programmers_29 {

	public static void main(String[] args) {
		String s ="Zbcdefg";
		//문자열을 하나씩 split()함수로 나누어서 배열에 넣는다.
		String[] array = s.split("");
		System.out.println(Arrays.toString(array));
		
		//문자열을 reverseOrder() 함수를 사용하여 역순으로 정렬시킨다.
		Arrays.sort(array,Collections.reverseOrder());
		System.out.println(Arrays.toString(array));
		
		//역순으로 정렬된 문자열을 String.join()함수를 이용하여 String형식으로 변환한다.
		String answer = String.join("", array);
		System.out.println(answer);
	}

}
