package programmers_level_1;

	/*
	 * ���α׷��ӽ� LEVEL_1 ��ձ��ϱ�
	 */
public class programmers_40 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		//���� ���� ������ �����Ѵ�.
		int sum =0;
		//������ ������ �����Ѵ�.
		double answer = 0;
		//�迭�� ���̸�ŭ �ݺ����� ������.
		for(int i=0 ; i<arr.length ; i++) {
			//�迭�� ���� ������ ���Ѵ�.
			sum += arr[i];
		}
		//��հ��� ���Ѵ�. double�� ����Ͽ� ����ȯ�� ���ش�.
		answer = sum / (double) arr.length;
		//���� ���Ͻ�Ų��.
		System.out.println(answer);
	}

}
