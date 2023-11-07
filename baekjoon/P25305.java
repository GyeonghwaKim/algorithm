package baekjoon;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class P25305 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] xArr=new int[n];
        for(int i=0;i<n;i++){
            xArr[i]=sc.nextInt();
        }
        Arrays.sort(xArr);

        System.out.println(xArr[n-k]);
    }
}
