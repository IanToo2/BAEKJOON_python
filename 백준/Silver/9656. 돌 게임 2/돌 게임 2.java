import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{

        String[] dp = new String[1_001];
        dp[1] = "CY";
        dp[2] = "SK";
        dp[3] = "CY";
        dp[4] = "SK";

        for(int i = 5; i <= 1000;i++){
            dp[i] = dp[i-2];
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(dp[n]);
    }
}
