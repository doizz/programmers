package programmers_level_2;

	/*
	 * ���α׷��ӽ� LEVEL_2 (���ڿ� �����ϱ�)
	 */
public class programmers_2_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="ababcdcdababcdcd";
		
		//���̰� 1�ϰ�� 1�� �����Ѵ�.
		if(s.length() == 1) 
			System.out.println(1);
        
		
        int answer = 1001;
        //���ڿ��� �����Ҽ��ִ°��� ���� s�� 2/1�� ������ ������ %2������ �ݺ����� ������.
        for (int i = 1; i <= s.length() / 2; i++) {
            String now, next = "", result = "";
            int hit = 1;
            //i�� ���̸�ŭ ���ڿ��� �߶� ���Ѵ�.
            for (int j = 0; j <= s.length() / i; j++) {
                int start = j * i;
                System.out.println("start::::::::"+start);
                int end = i * (j + 1) > s.length() ? s.length() : i * (j + 1);
                //���� ���ڿ��� now������ �����Ѵ�.
                now = next;
                //�������ڿ��� ©�� ���Ѵ�.
                next = s.substring(start, end);
                
                System.out.println("next:::::::"+next);
                //������� hit ������ ���ϱ⸦ ���ش�.
                if(now.equals(next)) {
                    hit++;
                } else {
                	//�ٸ���� result ������ ������ ���ڿ��� ���δ�.
                    result += (processHit(hit) + now);
                    hit = 1;
                }
            }
            result += (processHit(hit) + next);
            answer = Math.min(answer, result.length());
        }
        System.out.println(answer);
	}
	private static String processHit(int hit) {
	    return hit > 1 ? String.valueOf(hit) : "";
	}
}
