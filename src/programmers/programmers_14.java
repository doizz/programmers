package programmers;
/*
 * 프로그래머스 LEVEL_1 약수의 갯수와 덧셈
 */
public class programmers_14 {

	public static void main(String[] args) {
		int left = 13;
		int right = 17;
		int count = 0;
		int result = 0;
		//left의 수 부터 right의 수까지 1씩 증가시킨다.
		for(int i = left ; i <= right ; i++ ) {
			//left의 수에서 약수를 판별하기위해서 1부터 left수까지 1씩 증가시킨다.
			for(int j = 1 ; j <= i ; j++) {
				//left의 수 나누기 1씩 증가되는수가 약수인지 판별한다.
				if( i % j == 0) {
					//약수가 맞으면 카운트를 증가시킨다.
					count++;
				}
			}
			//약수가 짝수일 시에는 +를 아닐시에는 -를 하여 합계를 구한다.
			result += (count%2==0) ? i*1 : i*-1;
			//count 변수를 초기화 시킨다.
			count=0;
		}
		System.out.println(result);
	}

}
