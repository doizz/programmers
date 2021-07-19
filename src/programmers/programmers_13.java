package programmers;
/*
 * 프로그래머스 LEVEL_1 3진법 뒤집기
 */
public class programmers_13 {

	public static void main(String[] args) {
		
		int n =125;
		int answer=0;
		String result = "";
		//주어진 수 n이 0이될때까지 조건을 판별한다.
		 while (n != 0) {
			 //주어진 n의 수에서 3을 나누어 result 변수에 넣어준다.
			 result += Integer.toString(n % 3);
			 //n은 계속 3으로 나누어지는 수로 대입한다.
	            n /= 3;
	        }
		 	System.out.println(result);
		 	//3으로 나누어진수를 Integer.parseInt 3진법 변환으로 3진법 형식으로 만들어준다.
	        answer = Integer.parseInt(result, 3);
	        
	        //결과를 출력(리턴한다).
	        System.out.println(answer); 
	}

}
