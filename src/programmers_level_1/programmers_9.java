package programmers_level_1;
/*
 * 프로그래머스 LEVEL_1 소수 만들기 
 */
public class programmers_9 {

	public static void main(String[] args) {

		
		int[] nums = {1,2,7,6,4};
		int i,j,k,sum=0;
		int ans=0;
		//for문을 돌려서 3개의숫자의 합을 만든다
		for(i=0 ; i<nums.length ; i++) {
			for(j=i+1 ; j<nums.length ; j++) {
				for(k=j+1 ; k<nums.length ; k++) {
					//세개의 수의 합을 소수인지 판별한다.
					 if(isPrime(nums[i] + nums[j] + nums[k])){
	                        ans ++;  
	                    } 
				}
			}
		}
		System.out.println(ans);
	}
	
	public static Boolean isPrime(int num) {
		//에라토스테네스의 체 알고리즘으로 소수인지 판별한다
		//제곱근을 이용한 소수판별식(자세한 공부 및 개념 필요)
	        for(int i = 2; i <= Math.sqrt(num); i ++){
	            if(num % i == 0) return false;
	        }
	        return true;
	}

}

