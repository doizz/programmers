package programmers_level_1;

	/*
	 * ���α׷��ӽ� LEVEL_1 ���ڿ� �� p�� y�� ����
	 */
public class programmers_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "pPoooyY";
		boolean answer = true;
		int p_cnt = 0;
		int y_cnt = 0;
		//�ѱ��ھ� �迭�� ���� ������ ������ �ҹ��ڷ� ��ȯ�� �ѱ��ھ� �迭�� �־��ش�.
		//charAt() �Լ��� ����ص��ȴ�.
		String[] s_array = s.toLowerCase().split("");
		
		//�迭�� ũ�⸸ŭ for���� ������.
		for (int i=0 ; i<s_array.length ; i++) {
			//�迭�� ���ڰ� p�ϰ�� p_cnt ������ ������Ų��.
			//ī��Ƶ ������ �ϳ��� ������ p������ +�� y������ ���̳ʽ��� ��Ű�°͵� �ϳ��ǹ��
			if(s_array[i].equals("p")) {
				p_cnt++;
			} else if (s_array[i].equals("y")) {
				y_cnt++;
			}
		}
		//p�� y�� ������ �´��� �Ǻ��Ѵ�.
		if(p_cnt != y_cnt) {
			//�ٸ���� ������ �����Ѵ�.
			answer = false;
		}
		System.out.println(answer);
	}
}
