package programmers_level_1;

public class programmers_16 {
	/*
	 * ���α׷��ӽ� LEVEL_1 ��� ���� �������� 
	 */
	public static void main(String[] args) {

		String answer = "";
		String s= "qwer";
		//���� �����ڸ� ���Ͽ� ��� ������ ���ڸ� �����ͼ� subtiring���� ��� ���ڸ� ��ȯ�Ѵ�.
		answer = s.length()%2==0 ? s.substring(s.length()/2-1, s.length()/2+1) :  s.substring(s.length()/2, s.length()/2+1);
		System.out.println(answer);
	}

}
