package programmers;

import java.util.Arrays;
	/*
	 * ���α׷��ӽ� LEVEL_1 x��ŭ ������ �ִ� n���� ����
	 */
public class programmers_44 {

	public static void main(String[] args) {
		
		int x = -4;
		int n = 2;
		//�־������� ���Ѱ��� ������ ������ �����Ѵ�.(���⿡ int���� �Ѵ� ���ڱ��� ���õǾ����Ƿ� long�����μ���)
		long sum=0;
		//������ ������ �����Ѵ�.
		long[] answer = new long[n];
		//�ݺ����� ���� �־������� ���ϴ°��� �迭�� �����Ѵ�.
		for(int i=0 ; i<n ; i++) {
			sum +=x;
			answer[i] = sum;
		}
		//���� �����Ѵ�.
		System.out.println(Arrays.toString(answer));
	}

}
