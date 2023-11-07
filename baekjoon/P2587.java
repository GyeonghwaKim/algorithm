package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class P2587 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        int sum=Arrays.stream(arr).sum();

        Arrays.sort(arr);
        System.out.println(sum/ arr.length);
        System.out.println(arr[2]);
    }
}
