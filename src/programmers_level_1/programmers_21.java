package programmers_level_1;

public class programmers_21 {
/*
 * ���α׷��ӽ� LEVEL_1 �� ���� ������ ��
 */
	public static void main(String[] args) {

		int a =3;
		int b=3;
		long sum =0;
		//Math.min,max() �Լ��� �̿��Ͽ� �μ��� ���������� ū�������� ���� ���Ѵ�.	
		for(int i = Math.min(a, b) ; i <=Math.max(a, b); i++) {
			sum +=i;
		}
		
		System.out.println(sum);
	}
	

}
