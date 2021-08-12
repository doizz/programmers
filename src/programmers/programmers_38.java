package programmers;
	/*
	 * 프로그래머스 LEVEL_1 짝수와 홀수
	 */
public class programmers_38 {

	public static void main(String[] args) {
		int num =3;
		String answer = "";
		//삼항 연산자로 홀수인지 짝수인지 판별후 해당하는 값을 리턴한다.m
		answer = num%2 !=0 ? "Odd" : "Even";
		
		System.out.println(answer);
		
		
	}

}
