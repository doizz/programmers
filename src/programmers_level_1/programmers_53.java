package programmers_level_1;
	/*
	 * 프로그래머스 LEVEL_1 (8주차_ 최소직사각형)
	 */
public class programmers_53 {

	public static void main(String[] args) {
		int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
		 int answer = 0;
	        int max_v=0;
	        int max_h=0;
	        for(int i=0;i<sizes.length;i++){
	            int v=Math.max(sizes[i][0],sizes[i][1]);
	            int h=Math.min(sizes[i][0],sizes[i][1]);
	            max_v=Math.max(max_v,v);
	            max_h=Math.max(max_h,h);
	        }
	        System.out.println(max_v*max_h);
//	        return answer=max_v*max_h;
	}
}
