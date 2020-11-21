import java.util.Scanner;

public class Main {
    public static int houseRobber(int nums[]){
        if(nums.length ==0) return 0;
    	//if(nums.length == 1) return nums[0];
    
    	int[] dp = new int[nums.length];
    	dp[0] = nums[0]; 
    	dp[1] = Math.max(nums[0], nums[1]); 
    
    	for(int i = 2; i < nums.length; i++){
        	dp[i] = Math.max(dp[i-2] + nums[i], dp[i-1]);   
    	}
    
    	return dp[dp.length - 1];
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nums[]={1,5,2,1,11,9};
        System.out.println(houseRobber(nums));
    }
}
