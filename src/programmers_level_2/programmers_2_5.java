package programmers_level_2;

import java.util.Stack;
	/*
	 * 프로그래머스 LEVEL_2 짝지어 제거하기 (스택을 이용)
	 */
public class programmers_2_5 {

	public static void main(String[] args) {
		Stack<Character> stack = new Stack<>();
		String s ="baabaa";
		//String s ="cdcd";
		
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			
			if(!stack.isEmpty() && stack.peek() == ch)
				stack.pop();
			else stack.push(ch);
		}

		System.out.println(stack.isEmpty() ? 1 : 0);
	}

}
