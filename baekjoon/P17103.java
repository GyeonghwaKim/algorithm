package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class P17103
{
    static int tc,n,cnt;

    static boolean isPrimeNum(int a){
        for(int i=2;i<=Math.sqrt(a);i++){
            if(a%i==0) return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        tc=Integer.parseInt(br.readLine());

        for(int i=0;i<tc;i++){
            n=Integer.parseInt(br.readLine());
            cnt=0;
            for(int j=2;j<=n/2;j++){
                if(isPrimeNum(j)&&isPrimeNum(n-j)) cnt++;
            }
            System.out.println(cnt);
        }

    }
}
