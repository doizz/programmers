package programmers_level_1;

	/*
	 * ���α׷��ӽ� LEVEL_1 1����
	 */
public class programmers_47 {

	public static void main(String[] args) {
		int price = 3;
		int money = 20;
		int count = 4;
		
		long answer = 0;
		//�־��� �ݾ��� long���� ����ȯ�� �Ѵ�.
		long money2 = Long.valueOf(money);
		//�������մ� �ݾ׿��� Ż������ �����Ǵ� �ݾ��� ���ش�.
        for(int index = 1; index <= count; index++){
            money2 -= price * index;
        }
        //�ݾ��� 0���� ������ ������ �ݾ� , �������������� 0�� ���Ͻ�Ų��.
        answer = money2 < 0 ? money2 * -1 : 0;
        
        System.out.println(answer);
	}

}
