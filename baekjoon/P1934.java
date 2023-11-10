package baekjoon;

import java.util.Scanner;

public class P1934
{//유클리드 호제법 A*B/최대공약수 =최소 공배수
    //숫자가 3개 일때는 ,,?
    public static int getGCD(int num1,int num2){
        if(num1%num2==0){
            return num2;
        }
        return getGCD(num2,num1%num2);
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();

        for(int i=0;i<t;i++){
            int num1=sc.nextInt();
            int num2= sc.nextInt();
            System.out.println((num1*num2)/getGCD(num1,num2));
        }
    }
}
