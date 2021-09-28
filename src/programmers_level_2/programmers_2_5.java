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
			//주어진 변수에 문자열 하나씩 꺼낸다.
			char ch = s.charAt(i);
			
			//스택이 비어있지않거나 스택의 마지막값이 문자열과같은지 판별한다.
			if(!stack.isEmpty() && stack.peek() == ch)
				//스택의 마지막값과 꺼내온 문자가 일치하면 스택에서 제거한다.
				stack.pop();
			//문자가 일치하지않으면 스택에 넣는다.
			else stack.push(ch);
		}
		//스택이 비어있으면 1 을 아니면 0을 반환한다.
		System.out.println(stack.isEmpty() ? 1 : 0);
	}

}
