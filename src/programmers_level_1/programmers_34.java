package programmers_level_1;

import java.util.Arrays;
	/*
	 * ���α׷��ӽ� LEVEL_1 �ڸ��� ������ �迭�����
	 */
public class programmers_34 {

	public static void main(String[] args) {
		long n = 12345;
		//int���� String���� ��ȯ�����ش�.
		String a = ""+n;
		int cnt = 0;
		
		//�־��� �� ��ŭ �迭�� �����Ѵ�.
		int[] answer = new int[a.length()];
		
		//�־��� �� n�� 0����Ŭ������ �ݺ������ش�.
		 while(n>0){
			 //�迭�� ù��°���� �־����� ������ 10���Ͽ� ���� �����.
            answer[cnt] = (int) (n%10);
            //�־����� ������ 10���Ͽ� �������� ���� ���� �����Ѵ�.
            n /= 10;
            //�迭�� ������ ���� ������ ������Ų��.
            cnt++;
        }
		System.out.println(Arrays.toString(answer));
	}

}
