package programmers_level_1;
	/*
	 * 프로그래머스 LEVEL_1 (8주차_ 최소직사각형)
	 */
public class programmers_53 {

	public static void main(String[] args) {
//		int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
		int[][] sizes = {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};
		 	int answer = 0;
		 	//큰수를 담을 변수를 선언한다.
	        int max_v=0;
	        //작은수를 담을 변수를 선언한다
	        int max_h=0;
	        
	        //해당하는 배열의 길이만큼 반복문을 돌린다.
	        for(int i=0;i<sizes.length;i++){
	        	//배열의 i,0 i,1의 수를 비교하여 큰수와 작은수를 담는다
	            int v=Math.max(sizes[i][0],sizes[i][1]);
	            int h=Math.min(sizes[i][0],sizes[i][1]);
	            //배열을 순회하여 가장큰값을 변수에 담는다
	            max_v=Math.max(max_v,v);
	            //배열을 순회하여 가장 작은값을 변수에 담는다
	            max_h=Math.max(max_h,h);
	        }
	        //가로 세로길이를 비교하여 가장 큰수와 가장작은수를 곱하여 크기를 return한다.
	        System.out.println(max_v*max_h);
//	        return answer=max_v*max_h;
	}
}
