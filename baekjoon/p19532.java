package baekjoon;

import java.util.Scanner;

public class p19532 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        int d= sc.nextInt();
        int e= sc.nextInt();
        int f= sc.nextInt();

        int x=((c*e-f*b))/((a*e-b*d));
        int y=((c*d)-(f*a))/((b*d)-(e*a));

        System.out.println(x+" "+y);

    }

}
