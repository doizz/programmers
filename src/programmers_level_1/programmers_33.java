package programmers_level_1;

	/*
	 * 프로그래머스 LEVEL_1 자릿수 더하기
	 */
public class programmers_33 {

	public static void main(String[] args) {
		
		int n = 5412;
		int sum=0;
		//주어진 n의 수가 0이 될때까지 while문을 돌린다.
		while(n>0) {
			//주어진 수 n을 나누기 10을하여 각자릿수를 구한다.
			int div = n%10;
			//자릿수의 합을 구한다.
			sum += div;
			//주어진 수 n의 10을 나누어 while을 돌린다.
			n = n/10;
		}
		//자릿수의 합을 반환한다.
		System.out.println(sum);
	}

}
