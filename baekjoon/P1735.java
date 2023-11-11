package baekjoon;

import java.util.Scanner;

public class P1735 {
    static int A1,A2,B1,B2,numA,numB;

    static int GCD(int a,int b){
        if(a%b==0){
            return b;
        }
        return GCD(b,a%b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        A1= sc.nextInt();
        B1=sc.nextInt();
        A2=sc.nextInt();
        B2= sc.nextInt();

        numA=A1*B2+A2*B1;
        numB=B1*B2;
        int gcd=GCD(numA,numB);


        System.out.println(numA/gcd+" "+numB/gcd);

    }
}
