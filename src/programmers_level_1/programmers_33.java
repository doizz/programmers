package programmers_level_1;

	/*
	 * ���α׷��ӽ� LEVEL_1 �ڸ��� ���ϱ�
	 */
public class programmers_33 {

	public static void main(String[] args) {
		
		int n = 5412;
		int sum=0;
		//�־��� n�� ���� 0�� �ɶ����� while���� ������.
		while(n>0) {
			//�־��� �� n�� ������ 10���Ͽ� ���ڸ����� ���Ѵ�.
			int div = n%10;
			//�ڸ����� ���� ���Ѵ�.
			sum += div;
			//�־��� �� n�� 10�� ������ while�� ������.
			n = n/10;
		}
		//�ڸ����� ���� ��ȯ�Ѵ�.
		System.out.println(sum);
	}

}
