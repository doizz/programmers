package programmers_level_1;

import java.util.Arrays;
	/*
	 * ���α׷��ӽ� LEVEL_1 �̻��� ���� �����
	 */
public class programmers_31 {

	public static void main(String[] args) {
		String s= "try hello world";
		
		//���� ������ �������� ���ڿ��� ������.
		String[] ss = s.split("");
		String answer = "";
		int cnt = 0;
		//���ڿ��� �ϳ��� for���� ����Ͽ� ������.
		for(String array : ss) {
			//���࿡ �����Ͻÿ��� cnt 0���� ����� �ƴҰ�쿡�� cnt+1�� ���ش�.
			cnt = array.contains(" ") ? 0 : cnt + 1;
			//cnt�� �������� ¦�� Ȧ���� �����Ͽ� ��ҹ��ڸ� ���Ͽ� ���ڿ��� �����.
			answer += cnt%2==0 ? array.toLowerCase() : array.toUpperCase();
		}
		
		System.out.println(answer);
	}
	
}
