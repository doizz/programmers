package programmers;

import java.util.Arrays;
/*
 * ���α׷��ӽ� LEVEL_1 ����
 */
public class programmers_12 {
	//������ �о����� �����ϴ� ����� ��ư� �����ϸ� ������.
	//���� �����ؼ� Ǯ�����ϸ� ���� �����ΰŰ���.
	//���꿡�� ��û�� �μ��� �ݾ��� ���� ī��Ʈ�� ���ϴ°� ���� ����ȭ�� ����ΰŰ���.
	public static void main(String[] args) {

//		int[] d= {1,3,2,5,4};
		int[] d = {2,2,3,3};
		int budget = 10;
		int answer =0;
		//�迭�� ���Ľ����ش�.
		Arrays.sort(d);
		
		//�迭�� ���̸�ŭ for���� �����ش�.
		for(int i = 0 ; i < d.length ; i++) {
			//���꿡�� �� �μ����� ��û�� �ݾ��� ���ش�.
			budget -= d[i];
			//������ 0���� ������� ������ �������´�.
			if(budget < 0) {
				break;
			}
			//���꿡�� �� �μ����� ��û�ѱݾ��� ������ ������ ������ ī��Ʈ�� ���������ش�.
			answer++;
		}
		System.out.println(answer);
	}

}
