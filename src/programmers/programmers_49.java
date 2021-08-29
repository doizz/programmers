package programmers;

import java.util.Arrays;
	/*
	 * 프로그래머스 LEVEL_1 최대공약수와 최대공배수
	 */
public class programmers_49 {

	public static void main(String[] args) {
		int n =5;
		int m =20;
		 int[] answer = new int[2];
		   int big = Math.max(n, m);
	        int small = Math.min(n, m);
	        
	        answer[0] = gcd(big, small);
	        answer[1] = big*small/answer[0];
	        System.out.println(Arrays.toString(answer));
	}

	
	static int gcd(int a, int b) {
	    if(a % b == 0) {
	        return b;
	    }
	    return gcd(b, a%b);
	}
}