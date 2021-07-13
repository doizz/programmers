package programmers;

public class programmers_5 {
	/*
	 * 프로그래머스 LEVEL_1 내적
	 * 길이가 같은 두 1차원 정수 배열 a, b가 매개변수로 주어집니다. a와 b의 내적을 return 하도록 solution 함수를 완성해주세요.
	 */
	public static void main(String[] args) {
		int[] a= {1,2,3,4};
		int[] b = {-3,-1,0,2};
		
		//두 배열의 합을 담을 sum 변수를 선언한다.
		int sum=0;
		//a와b의 배열의 크기는 같으므로 a,b의 길이만큼 포문을 돌려준다.
		for(int i=0 ; i<a.length ; i++) {
			//a의 i번째와 b의 i번째의 값을 곱하여 합계 변수에 담는다.
			sum += a[i]*b[i];
		}
		
		System.out.println(sum);
	}

}
