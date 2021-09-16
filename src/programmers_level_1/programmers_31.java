package programmers_level_1;

import java.util.Arrays;
	/*
	 * 프로그래머스 LEVEL_1 이상한 문자 만들기
	 */
public class programmers_31 {

	public static void main(String[] args) {
		String s= "try hello world";
		
		//먼저 공백을 기준으로 문자열을 나눈다.
		String[] ss = s.split("");
		String answer = "";
		int cnt = 0;
		//문자열을 하나씩 for문을 사용하여 돌린다.
		for(String array : ss) {
			//만약에 공백일시에는 cnt 0으로 만들고 아닐경우에는 cnt+1을 해준다.
			cnt = array.contains(" ") ? 0 : cnt + 1;
			//cnt를 나눴을때 짝수 홀수를 구분하여 대소문자를 비교하여 문자열을 만든다.
			answer += cnt%2==0 ? array.toLowerCase() : array.toUpperCase();
		}
		
		System.out.println(answer);
	}
	
}
