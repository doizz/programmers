package programmers;

public class programmers_6 {
	/*
	 * ���α׷��ӽ� LEVEL_1 ü����(Ž���)
	 */
	public static void main(String[] args) {
		int n = 5;
		int[] lost = {2,4};
		int[] reserve = {1,3,5};
		int lostPlus =0;
		int reservePlus=0;
		//������ ü������ �������ִ� �л��� ���������� ��쵵 �ֱ⶧���� ���ǿ� �ش��ϴ� �л��� �Ǻ��Ѵ�.
		for(int i=0 ; i < lost.length ; i++) {
			for(int j=0 ; j < reserve.length ; j++) {
				if(lost[i] == reserve[j]) {
					//�ش����ǿ� �ش��ϴ� �л��� ������ ������ ������ ������ ���ϱ⸦ ���ش�.
					lostPlus++;
					//������ ü������ �������ִ� �л��� �����л��� ��� ������ ü������ �����Ƿ� �����ټ��ִ� �迭(reserve)�� �Ҿ���� �л��� �迭(lost)���� ����
					lost[i] = -1;
					reserve[j] = -1;
					break;
				}
			}
		}
		for(int i=0 ; i < lost.length ; i++) {
			for(int j=0 ; j < reserve.length ; j++) {
				//������ ü������ �������ִ� �л����ڿ��� ��,���� ������ �л��� ������ ü������ �����ټ� �ִ�.
				//�׷��� reserver�迭�Ǽ� +1, -1�� �Ͽ� �����ټ� �ִ� �л����� �Ǻ��Ѵ�.
				if(lost[i] == reserve[j]+1 || lost[i] == reserve[j]-1) {
					//�ش��ϴ� ���ǿ� ������ ������ ���ϱ⸦ �Ѵ�.
					reservePlus++;
					//reserve�迭�� ���� �л��� �Ȱ��� �л����� �����ټ� ���� ���� -1�� ������
					reserve[j] = -1;
					break;
				}
			}
		}
		//��ü �л������� �������� �л��� ���� ����, ������ ���� �����л��� ������������ �� ī��Ʈ�� �����ְ�
		//���� ���� ������ �����Ҽ� �ִ� �л����� �����ش�.
		n = n - lost.length + lostPlus + reservePlus;
		System.out.println(n);
	}

}
