package programmers_level_1;

public class programmers_8 {
	/*
	 * 프로그래머스 LEVEL_1 음양 더하기
	 */
	public static void main(String[] args) {

		int[] absolutes = {4,7,12};
		boolean[] signs = {true,false,true};
		int sum=0;
		
		for(int i=0 ; i<absolutes.length ; i++) {
			//signs 배열에 들어있는게 참일경우 +를 거짓일경우 -연산을 수행한다.
			if(signs[i]) {
				sum += absolutes[i];
			} else {
				sum -= absolutes[i];
			}
		}
		
		System.out.println(sum);
	}

}
