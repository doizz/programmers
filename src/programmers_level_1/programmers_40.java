package programmers_level_1;

	/*
	 * 프로그래머스 LEVEL_1 평균구하기
	 */
public class programmers_40 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		//합을 담을 변수를 선언한다.
		int sum =0;
		//리턴할 변수를 선언한다.
		double answer = 0;
		//배열의 길이만큼 반복분을 돌린다.
		for(int i=0 ; i<arr.length ; i++) {
			//배열의 값을 변수에 더한다.
			sum += arr[i];
		}
		//평균값을 구한다. double을 사용하여 형변환을 해준다.
		answer = sum / (double) arr.length;
		//값을 리턴시킨다.
		System.out.println(answer);
	}

}
