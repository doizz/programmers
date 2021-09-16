package programmers_level_1;

public class programmers_16 {
	/*
	 * 프로그래머스 LEVEL_1 가운데 글자 가져오기 
	 */
	public static void main(String[] args) {

		String answer = "";
		String s= "qwer";
		//삼항 연사자를 통하여 가운데 글자의 숫자를 가져와서 subtiring으로 가운데 글자를 반환한다.
		answer = s.length()%2==0 ? s.substring(s.length()/2-1, s.length()/2+1) :  s.substring(s.length()/2, s.length()/2+1);
		System.out.println(answer);
	}

}
