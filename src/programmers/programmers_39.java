package programmers;
	/*
	 * 프로그래머스 LEVEL_1 콜라츠 추측
	 */
public class programmers_39 {

	public static void main(String[] args) {
		int n = 626331;
		//입력받은 n의 자료형을 long타입으로 변환한다.
		long num = (long) n;
		//카운트 횟수를 저장할 변수를 선언한다.
		int cnt =0;
		//입력받은수가 1일때 까지 반복문을 돌려준다.
		while(num != 1) {
			//입력받은수 n이 짝수이면 나누기2 를 홀수이면 곱하기3 +1을 해준다.
			num = (num%2==0) ? num/2 : (num*3)+1;
			//카운트 횟수를 증가시킨다.
			cnt++;
			//만약 카운트가 500을 넘어갈경우 -1를 반환한다.
			if(cnt > 500) {
				cnt = -1;
				break;
			}
		}
		System.out.println(cnt);
	}

}
