package baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class P2581 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int M=sc.nextInt();
        int N=sc.nextInt();

        int sum=0;
        int min=Integer.MAX_VALUE;

        for(int i=M;i<=N;i++){
            if(i<2) continue;
            if(isPrime(i)==1){
                sum+=i;
                if(i<min) min=i;
            }
        }


        System.out.println(sum>0? sum+"\n"+min:-1);
    }

    public static int isPrime(int n){
        for(int i=2;i<=(int)Math.sqrt(n);i++){
            if(n%i==0){
                //소수가 아니다
                return 0;
            }
        }
        return 1;
    }
}
