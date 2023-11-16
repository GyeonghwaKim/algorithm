package 해결못한문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class P1983 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int tc=Integer.parseInt(br.readLine());

        while (tc--> 0){
            StringTokenizer st1=new StringTokenizer(br.readLine());
            int n=Integer.parseInt(st1.nextToken());
            int k=Integer.parseInt(st1.nextToken());
            double[] arr=new double[n];
            double score;

            for(int i=1;i<=n;i++){
                StringTokenizer st2=new StringTokenizer(br.readLine());
                int mid=Integer.parseInt(st2.nextToken());
                int last=Integer.parseInt(st2.nextToken());
                int sub=Integer.parseInt(st2.nextToken());
                arr[i-1]=(double) mid*0.35+last*0.45+sub*0.2;

                if(i==k) score = arr[i - 1];
            }
            Arrays.stream(arr).sorted();
            int output=0;
            for(int j=0;j<arr.length;j++){
                if(arr[j]==k) {
                    output=j;
                    break;
                }
            }


            System.out.println("#");

        }


    }
}