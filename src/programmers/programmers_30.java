package programmers;
	/*
	 * 프로그래머스 LEVEL_1 약수의합
	 */
public class programmers_30 {

	public static void main(String[] args) {
		
		int n =5;
		int sum=0;
		//n의 길이만큼 for문을 돌린다.
		for(int i=1 ; i<=n ; i++) {
			//n나누기 i의 값이 0인지 판별하여 약수인지 판별한다.
			if(n%i ==0) {
				//0일경우 합계변수에 i의 값을 더해준다.
				sum += i;
			}
		}
		//약수의 합을 반환한다.
		System.out.println(sum);
	}
}
