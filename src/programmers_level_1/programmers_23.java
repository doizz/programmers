package programmers_level_1;

public class programmers_23 {
	/*
	 * ���α׷��ӽ� LEVEL_1 ���￡�� �輭�� ã��
	 */
	public static void main(String[] args) {
		String[] seoul = {"Jane", "Kim"};
		String answer="";
		//�迭�� ���̸�ŭ for���� �����ش�.
		for(int i=0 ; i<seoul.length ; i++) {
			//�迭�� ����� "Kim"�� �ִ��� �Ǻ��Ѵ�.
			if(seoul[i].equals("Kim")) {
				//�ش��ϴ� �ܾ��� ��ġ�� ���� ã�Ƽ� ��ȯ�Ѵ�.
				answer = "�輭���� "+i+"�� �ִ�.";
				break;
			}
		}
		System.out.println(answer);
	}

}
