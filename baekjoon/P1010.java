package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1010 {
//메시간초과 ㅜㅜ
    static int conbi(int a,int b){
        if((b == 0) || (a == b)){
            return 1;
        }

        return conbi(a-1,b-1)+conbi(a-1,b);


    }
    static int MAX=30;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int tc=Integer.parseInt(br.readLine());
        StringBuilder sb=new StringBuilder();

        int[][] dp = new int[MAX + 1][MAX + 1];

        for (int i = 1; i <= MAX; i++) {
            dp[i][1] = i;
        }

        for (int j = 2; j <= MAX; j++) {
            for (int k = 2; k <= MAX; k++) {
                dp[j][k] = dp[j - 1][k - 1] + dp[j - 1][k];
            }
        }
        while (tc-- >0){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            sb.append(dp[b][a]).append("\n");
        }
        System.out.println(sb);
    }
}
