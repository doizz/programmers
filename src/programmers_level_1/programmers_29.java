package programmers_level_1;

import java.util.Arrays;
import java.util.Collections;

	/*
	 * ���α׷��ӽ� LEVEL_1 ���ڿ� ������������ ��ġ�ϱ�
	 */
public class programmers_29 {

	public static void main(String[] args) {
		String s ="Zbcdefg";
		//���ڿ��� �ϳ��� split()�Լ��� ����� �迭�� �ִ´�.
		String[] array = s.split("");
		System.out.println(Arrays.toString(array));
		
		//���ڿ��� reverseOrder() �Լ��� ����Ͽ� �������� ���Ľ�Ų��.
		Arrays.sort(array,Collections.reverseOrder());
		System.out.println(Arrays.toString(array));
		
		//�������� ���ĵ� ���ڿ��� String.join()�Լ��� �̿��Ͽ� String�������� ��ȯ�Ѵ�.
		String answer = String.join("", array);
		System.out.println(answer);
	}

}
