package programmers;

import java.util.Scanner;
	/*
	 * ���α׷��ӽ� LEVEL_1 ���簢�� �����
	 */
public class programmers_43 {

	public static void main(String[] args) {
		//���簢���� ���� �Է¹޴´�.
		 Scanner sc = new Scanner(System.in);
	        int m = sc.nextInt();
	        int n = sc.nextInt();
	    //���� for���� ����Ͽ� ���簢�� ���� ��´�.    
		for(int i=0 ; i<m ; i++) {
			for(int j=0 ; j<n ; j++) {
				System.out.print("*");
			}System.out.println();
		}
	}

}
