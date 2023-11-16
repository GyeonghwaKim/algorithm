package swea.d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1984 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int tc=Integer.parseInt(br.readLine());



        for(int i=1;i<=tc;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int min=Integer.MAX_VALUE;
            int max=Integer.MIN_VALUE;
            int sum=0;
            int cnt=-2;
            while (st.hasMoreTokens()){
                int num= Integer.parseInt(st.nextToken());
                min=(min<num? min:num);
                max=((max>num)? max:num);
                sum+=num;
                cnt++;
            }
            float answer=(float) (sum -(min+max))/cnt;
            System.out.println("#"+i+" "+Math.round(answer));
        }

    }
}
