package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class P9063 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();

        int[] x=new int[tc];
        int[] y=new int[tc];

        for(int i=0;i<tc;i++){
            x[i]= sc.nextInt();
            y[i]= sc.nextInt();
        }
        int wMax= Arrays.stream(x).max().getAsInt();
        int wMin=Arrays.stream(x).min().getAsInt();
        int hMax=Arrays.stream(y).max().getAsInt();
        int hMin=Arrays.stream(y).min().getAsInt();

        System.out.println((wMax-wMin)*(hMax-hMin));
    }
}
