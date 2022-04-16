import java.io.BufferedReader;
import java.io.InputStreamReader;

public class baekjoon2579 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        //계단
        int[] L = new int[n+1];

        for (int i = 1; i <= n; i++) {
            L[i] = Integer.parseInt(br.readLine());
        }

        //dp
        int[] dp = new int[n+1];
        dp[1] = L[1];

        //값
        for (int i = 2; i<= n; i++) {
            if (i==2) {
                dp[2] = L[1] + L[2];
            } else if (i==3) {
                dp[3] = Math.max(L[1], L[2]) + L[3];
            } else {
                dp[i] = Math.max(dp[i-3] + L[i-1], dp[i-2]) + L[i];
            }
        }

        System.out.println(dp[n]);
    }
}
