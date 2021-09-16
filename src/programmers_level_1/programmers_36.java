package programmers_level_1;

	/*
	 * 프로그래머스 LEVEL_1 정수 제곱근 판별하기
	 */
public class programmers_36 {

	public static void main(String[] args) {
		long n=5;
		//주어진 수가 제곱근인지 판별한다.
		Double result = Math.sqrt(n);
		
		//제곱근을 구한 result를 intValue()함수를 사용하여 같은지 판별한다.
		if( result == result.intValue()) {
			//true이면 제곱근이므로 pow()함수를 사용하여 제곱근을 구한다.
			System.out.println((long)Math.pow(result+1, 2));
		} else {
			//false이면 -1를 반환한다.
			System.out.println(-1);
		}
	}

}
