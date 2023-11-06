package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class P14215 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        int[] arr={a,b,c};
        int max= Arrays.stream(arr).max().getAsInt();
        int xPlusY=Arrays.stream(arr).sum()-max;
        int answer=xPlusY+(xPlusY+((a==b&&b==c)? -max:-1));

        if((a+b+c>answer)){
            System.out.println(answer);
        }else {
            System.out.println(a+b+c);
        }

    }
}
