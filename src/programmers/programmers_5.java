package programmers;

public class programmers_5 {
	/*
	 * ���α׷��ӽ� LEVEL_1 ����
	 * ���̰� ���� �� 1���� ���� �迭 a, b�� �Ű������� �־����ϴ�. a�� b�� ������ return �ϵ��� solution �Լ��� �ϼ����ּ���.
	 */
	public static void main(String[] args) {
		int[] a= {1,2,3,4};
		int[] b = {-3,-1,0,2};
		
		//�� �迭�� ���� ���� sum ������ �����Ѵ�.
		int sum=0;
		//a��b�� �迭�� ũ��� �����Ƿ� a,b�� ���̸�ŭ ������ �����ش�.
		for(int i=0 ; i<a.length ; i++) {
			//a�� i��°�� b�� i��°�� ���� ���Ͽ� �հ� ������ ��´�.
			sum += a[i]*b[i];
		}
		
		System.out.println(sum);
	}

}
