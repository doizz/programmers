package programmers;

	/*
	 * 프로그래머스 LEVEL_1 수박수박수박수박수?
	 */
public class programmers_26 {

	public static void main(String[] args) {
		String answer ="";
		
		int n =10;
		//입력받은 n의 수만큼 for문을 돌린다.
		for(int i=1 ; i<=n ; i++) {
			//i의 숫자가 홀수냐 짝수냐의 따라서 수,박 글자를 더한다.
			answer += i%2==0 ? "박" : "수";
		}
		System.out.println(answer);
	}

}
