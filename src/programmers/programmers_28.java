package programmers;

public class programmers_28 {

	public static void main(String[] args) {
//		int d = Integer.parseInt(s);
		
		
		String s = "1234";
		boolean sign = true;
		int answer = 0;
		//���ڿ��� ���̸�ŭ for���� ������.
		for(int i = 0 ; i < s.length() ; i++) {
			//���ڿ��� �ϳ��� ������ �־� ���� �Ǻ��Ѵ�.
			char ch = s.charAt(i);
			//ó���� ��ȣ�� - �ϰ�� ������ false�� �����Ѵ�.
			if(ch == '-') {
				sign = false;
			} else {
			//���ڸ� �ƽ�Ű�ڵ带 ����Ͽ� ���ڸ� ���Ѵ�.
				answer = answer * 10 + (ch - '0');
				System.out.println(answer);
			}
		}
		//��ȣ�� ������ ���� sign�� �Ǻ��Ͽ� ���� ���ϰ��� �����.
		answer = sign ? 1 * answer : -1 * answer;
		System.out.println(answer);
	}

}
