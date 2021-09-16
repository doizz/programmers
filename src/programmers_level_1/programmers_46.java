package programmers_level_1;

import java.util.ArrayList;
import java.util.Arrays;
	/*
	 * 프로그래머스 LEVEL_1 모의고사
	 */
public class programmers_46 {

	public static void main(String[] args) {
		int[] answers = {1,2,3,4,5};
ArrayList<Integer> arrList = new ArrayList<>();
        
		//수포자들이 찍는 패턴을 배열에 담는다.
        int[] a = {1,2,3,4,5};
        int[] b = {2,1,2,3,2,4,2,5};
        int[] c = {3,3,1,1,2,2,4,4,5,5};
        
        //수포자들이 답을 맞춘 갯수를 담는 변수.
        int a_r = 0;
        int b_r = 0;
        int c_r = 0;
        
        // 1번 수포자: 12345 반복 5
        // 2번 수포자: 21232425 반복 8
        // 3번 수포자: 3311224455 반복 10
        for(int i=0; i < answers.length; i++){
            if(answers[i] == a[i % 5])
                a_r++;
            if(answers[i] == b[i % 8])
                b_r++;
            if(answers[i] == c[i % 10])
                c_r++;
        }
        
        //답을 비교하여 max값을 뽑는다.
        int max = Math.max(a_r, Math.max(b_r, c_r));
        if(max == a_r){
            arrList.add(1);
        }
        if(max == b_r)
            arrList.add(2);
        if(max == c_r)
            arrList.add(3);
        
        int size = arrList.size();
        int[] answer = new int[size];
            
        //많이 맞춘 수포자를 리턴시킨다.
        for(int i =0; i<size; i++){
            answer[i] = arrList.get(i);
        }
        System.out.println(Arrays.toString(answer));
	}

}
