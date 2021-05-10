import java.util.Scanner;

public class COuntingBits_338 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int a[]= new int[num+1];
		a=array(num);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	private static int[] array(int num) {
		if (num == 0) return new int[]{0};
        if (num == 1) return new int[]{0, 1};
        
        int[] dp = new int[num+1];
        dp[0] = 0;
        dp[1] = 1;
        
        int currPow2 = 1;
        for (int i=2; i<=num; i++) {
            if (currPow2 * 2 == i) {
                dp[i] = 1;
                currPow2 *= 2;
            }
            else dp[i] = dp[currPow2] + dp[i - currPow2];
        }
        
        return dp;
	}
}
