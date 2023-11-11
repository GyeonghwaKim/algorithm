package baekjoon;

import java.util.Scanner;

public class P2485
{
    public static int getGCD(int num1,int num2){
        if(num1%num2==0) return num2;
        return getGCD(num2,num1%num2);
    }
    static int GCD;
    static int num1;
    static int num2;
    static int num3;
    static int n;

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        n=sc.nextInt();

        num1=sc.nextInt();
        num2= sc.nextInt();
        GCD=num2-num1;
        for(int i=2;i<n;i++){

            num3=sc.nextInt();
            GCD=getGCD(GCD,num3-num2);
            num2=num3;
        }

        System.out.println((num3-num1)/GCD+1-n);

    }
}
