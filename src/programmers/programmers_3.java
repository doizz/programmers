package programmers;

import java.util.*;

public class programmers_3 {
	/*
	 * ���α׷��ӽ� ������������ ���� ã��
	 */
	public static void main(String[] args) {
		//�����濡 ������ �ο�
		String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
		//�����濡 ������ �ο�
		String[] completion = {"josipa", "filipa", "marina", "nikola"};
		
		int i ;
		//�����濡 ������ �ο� �� ������ �ο��� �迭�� ���Ľ�Ų��.
		Arrays.sort(participant);
		Arrays.sort(completion);
		//������ �ο��� �迭��ŭ ������ ������.
		for( i=0; i<completion.length ; i++) {
			//���� ������ �ο��� ������ �ο��� �̸��� �ٸ���� �� ���� ���Ͻ�Ų��.
			if(!participant[i].equals(completion[i])) {
				System.out.println(participant[i]);
			}
		}
		//���ָ��� �ο��� �迭�� ����������� �� ���� ���Ͻ�Ų��.
		System.out.println(participant[i]);
	}

}
