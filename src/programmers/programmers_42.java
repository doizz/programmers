package programmers;
	/*
	 * 프로그래머스 LEVEL_1 하샤드의 수
	 */
public class programmers_42 {

	public static void main(String[] args) {
		int arr = 13;
		int sum =0;
		//주어진수를 한글자씩 더하기위해 String배열로 변환한다.
		String[] n = String.valueOf(arr).split("");
		
		//반복문을 사용하여 각각의 수를 더한다.
		for(String i : n) {
			sum += Integer.parseInt(i);
		}
		
		//각 수의 합을 더한값이 주어진수 나누기했을때 나머지가 0일경우 true를 반환한다.
		if(arr%sum==0) {
			System.out.println("true");
		}
	}

}
