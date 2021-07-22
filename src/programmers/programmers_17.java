package programmers;

public class programmers_17 {
	/*
	 * 프로그래머스 LEVEL_1 2016년
	 */
	public static void main(String[] args) {
		  int total = 0;
		  //요일을 반환할 배열을 생성한다.
	      String w[] = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
	      //일수 체크를위한 배열을 생성한다.
	      int m[] = {31, 29, 31, 30, 31, 30,31, 31, 30, 31, 30, 31};
	      //주어진 변수 5, 24를 선언한다.
	      int a=5;
	      int b=24;
	      //포문으로 해당하는 월에 대한 일수를 더한다.
	      for(int i =0;i<a-1;i++){
	          total += m[i];
	      }
	      //해당하는 월에서 일수를 빼준다.
	      total += b-1;
	      //전체일에서 나누기 7을 하여 요일을 구한다.
	      String answer = w[total%7];
	      //요일은 반환한다.
	      System.out.println(answer);
		
	}

}
