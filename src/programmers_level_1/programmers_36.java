package programmers_level_1;

	/*
	 * ���α׷��ӽ� LEVEL_1 ���� ������ �Ǻ��ϱ�
	 */
public class programmers_36 {

	public static void main(String[] args) {
		long n=5;
		//�־��� ���� ���������� �Ǻ��Ѵ�.
		Double result = Math.sqrt(n);
		
		//�������� ���� result�� intValue()�Լ��� ����Ͽ� ������ �Ǻ��Ѵ�.
		if( result == result.intValue()) {
			//true�̸� �������̹Ƿ� pow()�Լ��� ����Ͽ� �������� ���Ѵ�.
			System.out.println((long)Math.pow(result+1, 2));
		} else {
			//false�̸� -1�� ��ȯ�Ѵ�.
			System.out.println(-1);
		}
	}

}
