package programmers_level_1;

import java.util.Arrays;
	/*
	 * ���α׷��ӽ� LEVEL_1 �ִ������� �ִ�����
	 */
public class programmers_49 {

	public static void main(String[] args) {
		int n =5;
		int m =20;
		int[] answer = new int[2];
		//�־��� �� ���� ���Ͽ� ū ���� ���� ���� ������ �����Ѵ�.
	    int big = Math.max(n, m);
        int small = Math.min(n, m);
        
        //��Ŭ���� ȣ�������� �ִ������� �ִ������� ���Ѵ�.
        answer[0] = gcd(big, small);
        answer[1] = big*small/answer[0];
        //���� �����Ѵ�.
        System.out.println(Arrays.toString(answer));
	}

	
	static int gcd(int a, int b) {
	    if(a % b == 0) {
	        return b;
	    }
	    return gcd(b, a%b);
	}
}