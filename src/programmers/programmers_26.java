package programmers;

	/*
	 * ���α׷��ӽ� LEVEL_1 ���ڼ��ڼ��ڼ��ڼ�?
	 */
public class programmers_26 {

	public static void main(String[] args) {
		String answer ="";
		
		int n =10;
		//�Է¹��� n�� ����ŭ for���� ������.
		for(int i=1 ; i<=n ; i++) {
			//i�� ���ڰ� Ȧ���� ¦������ ���� ��,�� ���ڸ� ���Ѵ�.
			answer += i%2==0 ? "��" : "��";
		}
		System.out.println(answer);
	}

}
