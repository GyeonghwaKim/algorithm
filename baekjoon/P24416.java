package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P24416 {

    static int[] arr;
    static int cnt1,cnt2;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int n=Integer.parseInt(br.readLine());

        arr=new int[n];

        cnt1=0;
        cnt2=0;

        recursion(n);
        dynamic(n);
        System.out.println(cnt1+" "+cnt2);



    }

    public static int recursion(int n){
        if(n==1 || n==2) {
            cnt1++;
            return 1;
        }
        return recursion(n-1)+recursion(n-2);
    }

    public static int dynamic(int n){
        arr[0]=arr[1]=1;
        for(int i=2;i<n;i++){
            cnt2++;
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[n-1];
    }
}
