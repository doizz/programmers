package programmers_level_1;
/*
 * ���α׷��ӽ� LEVEL_1 �Ҽ� ����� 
 */
public class programmers_9 {

	public static void main(String[] args) {

		
		int[] nums = {1,2,7,6,4};
		int i,j,k,sum=0;
		int ans=0;
		//for���� ������ 3���Ǽ����� ���� �����
		for(i=0 ; i<nums.length ; i++) {
			for(j=i+1 ; j<nums.length ; j++) {
				for(k=j+1 ; k<nums.length ; k++) {
					//������ ���� ���� �Ҽ����� �Ǻ��Ѵ�.
					 if(isPrime(nums[i] + nums[j] + nums[k])){
	                        ans ++;  
	                    } 
				}
			}
		}
		System.out.println(ans);
	}
	
	public static Boolean isPrime(int num) {
		//�����佺�׳׽��� ü �˰������� �Ҽ����� �Ǻ��Ѵ�
		//�������� �̿��� �Ҽ��Ǻ���(�ڼ��� ���� �� ���� �ʿ�)
	        for(int i = 2; i <= Math.sqrt(num); i ++){
	            if(num % i == 0) return false;
	        }
	        return true;
	}

}

