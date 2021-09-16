package programmers_level_1;

import java.util.Arrays;
	/*
	 * 프로그래머스 LEVEL_1 최대공약수와 최대공배수
	 */
public class programmers_49 {

	public static void main(String[] args) {
		int n =5;
		int m =20;
		int[] answer = new int[2];
		//주어진 두 수에 대하여 큰 값과 작은 값을 변수에 대입한다.
	    int big = Math.max(n, m);
        int small = Math.min(n, m);
        
        //유클리드 호제법으로 최대공약수와 최대공배수를 구한다.
        answer[0] = gcd(big, small);
        answer[1] = big*small/answer[0];
        //값을 리턴한다.
        System.out.println(Arrays.toString(answer));
	}

	
	static int gcd(int a, int b) {
	    if(a % b == 0) {
	        return b;
	    }
	    return gcd(b, a%b);
	}
}