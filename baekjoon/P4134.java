package baekjoon;

import java.util.Scanner;

public class P4134 {
    static long primeNUm;

    public static boolean isPrimeNum(long a){
        if(a<2) return false;
        for(int i=2;i<=Math.sqrt(a);i++){
            if(a%i==0) return false;
        }
        return true;
    }
    public static long nextPrimeNum(long a){
        a += 1;
        while(true){
            if(isPrimeNum(a)) return a;
            else a++;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long tc=sc.nextLong();

        for(int i=0;i<tc;i++){
            long n= sc.nextLong();
            if(isPrimeNum(n)) primeNUm=n;
            else primeNUm=nextPrimeNum(n);
            System.out.println(primeNUm);
        }
    }
}
