package programmers_level_2;
	/*
	 * 프로그래머스 LEVEL_2 124나라의 숫자
	 */
public class programmers_2_1 {

	public static void main(String[] args) {
		// 주어진 n의 변수.
		int n = 8;
		//1,2,4 를 배열에 담는다.
		String[] num = {"4", "1", "2"};
		/*
		//n을 3으로 나눴을때의 값을 찾는다.
		//n을 3으로 나눴을떄 나머지가 0일경우 4로 변경한다.
		//n을-1 해주고 3을 나눴을때 몫으로 다시 0이 될떄까지 계속 연산을 실행한다.
		//나머지를 뒤에서부터 값을 넣어서 return값을 만든다.
		 */
		
		//리턴할 String변수 선언
	    String answer = "";
	      
	    //n이 0보다 클경우 반복한다.
	    while(n > 0){
	    	//n을 3으로 나눴을떄 나머지를 배열에서 가져온다.
	        answer = num[n % 3] + answer;
	        //n-1을 하고난후 3으로 나눴을때 몫을 n변수에 대입한다.
	        n = (n - 1) / 3;
	    }
	    //값을 리턴한다.
	    System.out.println(answer);	      
	}

}
