package baekjoon;

import java.util.Scanner;

public class P4948
{
    static int n;
    static int cnt;
    static boolean primeNum(int a){
        for(int i=2;i<=Math.sqrt(a);i++){
            if(a%i==0)
                return false;
        }
        return true;
    }
    static int getPrimeNum(int n){
        for(int i=n+1;i<=2*n;i++){

            if (primeNum(i)) cnt++;

        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        while(true){
            cnt=0;
            n= sc.nextInt();
            if(n==0) break;

            System.out.println(getPrimeNum(n));

        }

    }
}
