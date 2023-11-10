package baekjoon;

import java.util.Scanner;

public class P13241
{//유클리드호제법
    public static long getGCD(long num1,long num2){
        if(num1%num2==0){
            return num2;
        }
        return getGCD(num2,num1%num2);
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        long num1= sc.nextLong();
        long num2= sc.nextLong();


        System.out.println((num1*num2)/getGCD(num1,num2));
    }
}
