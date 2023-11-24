package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P15650 {
    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        N=Integer.parseInt(st.nextToken());
        M=Integer.parseInt(st.nextToken());

        arr=new int[M];

        dfs(0,1);
        System.out.println(sb);

    }

    static int N;
    static int M;

    static int[] arr;

    static StringBuilder sb=new StringBuilder();

    static void dfs(int depth, int num){
        if(depth==M){
            for(int val:arr) sb.append(val).append(" ");
            sb.append("\n");
            return;
        }

        for(int i=num;i<=N;i++){
                arr[depth]=i;
                dfs(depth+1,i+1);
            }
        }
    }

