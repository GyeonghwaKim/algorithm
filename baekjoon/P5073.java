package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class P5073 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            int a= sc.nextInt();
            int b= sc.nextInt();
            int c=sc.nextInt();
            if((a==0&&b==0&&c==0)) break;

            int[] arr={a,b,c};
            int max= Arrays.stream(arr).max().getAsInt();
            int sum=Arrays.stream(arr).sum();

            if(a==b&b==c) System.out.println("Equilateral");
            else if(max>=(sum-max)) System.out.println("Invalid");
            else if (a==b|a==c|b==c) System.out.println("Isosceles");
            else System.out.println("Scalene");
        }
    }
}
