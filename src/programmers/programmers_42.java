package programmers;
	/*
	 * ���α׷��ӽ� LEVEL_1 �ϻ����� ��
	 */
public class programmers_42 {

	public static void main(String[] args) {
		int arr = 13;
		int sum =0;
		//�־������� �ѱ��ھ� ���ϱ����� String�迭�� ��ȯ�Ѵ�.
		String[] n = String.valueOf(arr).split("");
		
		//�ݺ����� ����Ͽ� ������ ���� ���Ѵ�.
		for(String i : n) {
			sum += Integer.parseInt(i);
		}
		
		//�� ���� ���� ���Ѱ��� �־����� ������������ �������� 0�ϰ�� true�� ��ȯ�Ѵ�.
		if(arr%sum==0) {
			System.out.println("true");
		}
	}

}
