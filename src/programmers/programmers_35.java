package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

	/*
	 * ���α׷��ӽ� LEVEL_1 ���� ������������ ��ġ�ϱ�.
	 */
public class programmers_35 {

	public static void main(String[] args) {
		long n = 118372;
		// longŸ���� String Ÿ������ ��ȯ�Ѵ�.
		String s = String.valueOf(n);
		//���ھ� char�迭�� ��´�.
		char[] c = s.toCharArray();
		//�������� ������ ��Ų��.
		Arrays.sort(c);
		//���������� �Ͽ� ���� ���Ѵ�.
		s = new StringBuilder(new String(c)).reverse().toString();
		//StringŸ���� �ٽ� ��ȯŸ���� long���� ��ȯ�Ѵ�.
		long answer = Long.parseLong(s);
		System.out.println(s);

	}

}
