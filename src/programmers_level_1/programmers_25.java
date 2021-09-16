package programmers_level_1;
	/*
	 * 프로그래머스 LEVEL_1 문자열 다루기 기본
	 */
public class programmers_25 {

	public static void main(String[] args) {

		boolean answer = true;
		String s = "1234";
		//길이가 4 또는 6이여야만 true를 반환한다.
		if(s.length() !=4 && s.length() != 6) answer = false;
		//문자열을 하나씩 비교하여 숫자인지만 판별한다.
		for(int i=0 ; i<s.length() ; i++) {
			if(s.charAt(i) >='A') {
				answer = false;
			}
		}
		System.out.println(answer);
	}

}
