package programmers_level_1;
	/*
	 * ���α׷��ӽ� LEVEL_1 ���ڿ� �ٷ�� �⺻
	 */
public class programmers_25 {

	public static void main(String[] args) {

		boolean answer = true;
		String s = "1234";
		//���̰� 4 �Ǵ� 6�̿��߸� true�� ��ȯ�Ѵ�.
		if(s.length() !=4 && s.length() != 6) answer = false;
		//���ڿ��� �ϳ��� ���Ͽ� ���������� �Ǻ��Ѵ�.
		for(int i=0 ; i<s.length() ; i++) {
			if(s.charAt(i) >='A') {
				answer = false;
			}
		}
		System.out.println(answer);
	}

}
