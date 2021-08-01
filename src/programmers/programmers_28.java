package programmers;

public class programmers_28 {

	public static void main(String[] args) {
//		int d = Integer.parseInt(s);
		
		
		String s = "1234";
		boolean sign = true;
		int answer = 0;
		//문자열의 길이만큼 for문을 돌린다.
		for(int i = 0 ; i < s.length() ; i++) {
			//문자열을 하나씩 변수에 넣어 값을 판별한다.
			char ch = s.charAt(i);
			//처음의 부호가 - 일경우 변수에 false를 대입한다.
			if(ch == '-') {
				sign = false;
			} else {
			//숫자를 아스키코드를 사용하여 숫자를 구한다.
				answer = answer * 10 + (ch - '0');
				System.out.println(answer);
			}
		}
		//부호의 변수를 담은 sign을 판별하여 최종 리턴값을 만든다.
		answer = sign ? 1 * answer : -1 * answer;
		System.out.println(answer);
	}

}
