package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1976 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int tc=Integer.parseInt(br.readLine());
        for(int i=1;i<=tc;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int h1=Integer.parseInt(st.nextToken());
            int m1=Integer.parseInt(st.nextToken());
            int h2=Integer.parseInt(st.nextToken());
            int m2=Integer.parseInt(st.nextToken());

            int hour=(h1+h2+((m1+m2)/60))%12;

            System.out.println("#"+i+" "+((hour==0)? 12:hour)+" "+(m1+m2)%60);
        }
    }
}
