package programmers_level_1;
	/*
	 * ���α׷��ӽ� LEVEL_1 (8����_ �ּ����簢��)
	 */
public class programmers_53 {

	public static void main(String[] args) {
//		int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
		int[][] sizes = {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};
		 	int answer = 0;
		 	//ū���� ���� ������ �����Ѵ�.
	        int max_v=0;
	        //�������� ���� ������ �����Ѵ�
	        int max_h=0;
	        
	        //�ش��ϴ� �迭�� ���̸�ŭ �ݺ����� ������.
	        for(int i=0;i<sizes.length;i++){
	        	//�迭�� i,0 i,1�� ���� ���Ͽ� ū���� �������� ��´�
	            int v=Math.max(sizes[i][0],sizes[i][1]);
	            int h=Math.min(sizes[i][0],sizes[i][1]);
	            //�迭�� ��ȸ�Ͽ� ����ū���� ������ ��´�
	            max_v=Math.max(max_v,v);
	            //�迭�� ��ȸ�Ͽ� ���� �������� ������ ��´�
	            max_h=Math.max(max_h,h);
	        }
	        //���� ���α��̸� ���Ͽ� ���� ū���� ������������ ���Ͽ� ũ�⸦ return�Ѵ�.
	        System.out.println(max_v*max_h);
//	        return answer=max_v*max_h;
	}
}
