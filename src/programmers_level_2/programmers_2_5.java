package programmers_level_2;

import java.util.Stack;
	/*
	 * ���α׷��ӽ� LEVEL_2 ¦���� �����ϱ� (������ �̿�)
	 */
public class programmers_2_5 {

	public static void main(String[] args) {
		Stack<Character> stack = new Stack<>();
		String s ="baabaa";
		//String s ="cdcd";
		
		for (int i = 0; i < s.length(); i++) {
			//�־��� ������ ���ڿ� �ϳ��� ������.
			char ch = s.charAt(i);
			
			//������ ��������ʰų� ������ ���������� ���ڿ��������� �Ǻ��Ѵ�.
			if(!stack.isEmpty() && stack.peek() == ch)
				//������ ���������� ������ ���ڰ� ��ġ�ϸ� ���ÿ��� �����Ѵ�.
				stack.pop();
			//���ڰ� ��ġ���������� ���ÿ� �ִ´�.
			else stack.push(ch);
		}
		//������ ��������� 1 �� �ƴϸ� 0�� ��ȯ�Ѵ�.
		System.out.println(stack.isEmpty() ? 1 : 0);
	}

}
