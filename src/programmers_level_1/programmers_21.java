package programmers_level_1;

public class programmers_21 {
/*
 * 프로그래머스 LEVEL_1 두 정수 사이의 합
 */
	public static void main(String[] args) {

		int a =3;
		int b=3;
		long sum =0;
		//Math.min,max() 함수를 이용하여 두수의 작은값부터 큰값까지의 합을 구한다.	
		for(int i = Math.min(a, b) ; i <=Math.max(a, b); i++) {
			sum +=i;
		}
		
		System.out.println(sum);
	}
	

}
