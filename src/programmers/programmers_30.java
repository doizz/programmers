package programmers;
	/*
	 * ���α׷��ӽ� LEVEL_1 �������
	 */
public class programmers_30 {

	public static void main(String[] args) {
		
		int n =5;
		int sum=0;
		//n�� ���̸�ŭ for���� ������.
		for(int i=1 ; i<=n ; i++) {
			//n������ i�� ���� 0���� �Ǻ��Ͽ� ������� �Ǻ��Ѵ�.
			if(n%i ==0) {
				//0�ϰ�� �հ躯���� i�� ���� �����ش�.
				sum += i;
			}
		}
		//����� ���� ��ȯ�Ѵ�.
		System.out.println(sum);
	}
}
