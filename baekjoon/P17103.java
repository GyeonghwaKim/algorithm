package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P17103
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        boolean[] arr=new boolean[1_000_001];

        arr[0]=arr[1]=true;

        for(int i=2;i*i<=1_000_000;i++){
            if(!arr[i]){
                for(int j=i+i;j<1_000_000;j+=i){
                    arr[j]=true;
                }
            }
        }

        int TC=Integer.parseInt(br.readLine());
        while (TC-->0){
            int N=Integer.parseInt(br.readLine());
            int cnt=0;
            for(int k=2;k<=N/2;k++){
                if(!arr[k]&&!arr[N-k]) cnt++;
            }
            sb.append(cnt).append("\n");
        }
        System.out.println(sb);



    }
}
