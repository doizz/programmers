package programmers;
	/*
	 * ���α׷��ӽ� LEVEL_1 �ݶ��� ����
	 */
public class programmers_39 {

	public static void main(String[] args) {
		int n = 626331;
		//�Է¹��� n�� �ڷ����� longŸ������ ��ȯ�Ѵ�.
		long num = (long) n;
		//ī��Ʈ Ƚ���� ������ ������ �����Ѵ�.
		int cnt =0;
		//�Է¹������� 1�϶� ���� �ݺ����� �����ش�.
		while(num != 1) {
			//�Է¹����� n�� ¦���̸� ������2 �� Ȧ���̸� ���ϱ�3 +1�� ���ش�.
			num = (num%2==0) ? num/2 : (num*3)+1;
			//ī��Ʈ Ƚ���� ������Ų��.
			cnt++;
			//���� ī��Ʈ�� 500�� �Ѿ��� -1�� ��ȯ�Ѵ�.
			if(cnt > 500) {
				cnt = -1;
				break;
			}
		}
		System.out.println(cnt);
	}

}
