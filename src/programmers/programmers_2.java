package programmers;

import java.util.Arrays;
import java.util.Stack;

public class programmers_2 {
	/*
	 * 프로그래머스 LEVE_1 크레인 인형 뽑기
	 */
	public static void main(String[] args) {

		//주어진 배열값 선언
		int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		
		//바구니에 2개의 값이 연속으로 들어가있을때 값이 없어지면서 그 카운트를 담는 변수
		int answer =0;
		//바구니를 대신하는 변수를 스택으로 선언
		Stack<Integer> baguni = new Stack<Integer>();
		
		//바구니에 값을 처음 0으로 선언하여준다.
		baguni.push(0);
		
		//맨처음에는 크레인을 움직이는 갯수를 파싱하여 그만큼의 숫자로 포문을 돌린다.
		for(int i=0 ; i< moves.length ; i++) {
			//크레인이 접근할 배열의 갯수만큼 포문을 돌린다.
			for(int j =0 ; j < board.length ; j++) {
			//크레인이 접근할 배열의 행을 파싱하여 변수에 저장한다.	
			int select = moves[i]-1;
			
			//크레인이 접근한 행에서 빈값인지 아닌지 판별하여 다음 로직을 수행한다.
			if( 0 != board[j][select]) {
				//크레인이 접근한 배열의 값이 0이 아닐경우에는 바구니에 들어가있는 최상위 값과 비교를 한다.
				if(baguni.peek() == board[j][select]) {
					//만약 배열의값과 바구니의 들어있는 값이 일치할경우 바구니의 값을 꺼내고 카운트를 증가시킨다.
					baguni.pop();
					//크레인이 가져온 배열의 값을 빈값인(0)으로 초기화시켜준다.
					board[j][select] = 0;
					//카운트를 증가시킨다.
					answer++;
				} else {
					//바구니의 최상위값과 크레인이 접근한 배열의 값이 틀릴경우 바구니에 크레인이 접근한 배열의 값을 넣어준다.
					baguni.push(board[j][select]);	
				}
			continue;
			};
			}
		}
		
		System.out.println(answer);
		
		
		
	}

}


/*
0 0 0 0 0
0 0 1 0 3
0 2 5 0 1
4 2 4 4 2
3 5 1 3 1
*/