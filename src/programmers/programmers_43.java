package programmers;

import java.util.Scanner;
	/*
	 * 프로그래머스 LEVEL_1 직사각형 별찍기
	 */
public class programmers_43 {

	public static void main(String[] args) {
		//직사각형의 수를 입력받는다.
		 Scanner sc = new Scanner(System.in);
	        int m = sc.nextInt();
	        int n = sc.nextInt();
	    //이중 for문을 사용하여 직사각형 별을 찍는다.    
		for(int i=0 ; i<m ; i++) {
			for(int j=0 ; j<n ; j++) {
				System.out.print("*");
			}System.out.println();
		}
	}

}
