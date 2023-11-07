package baekjoon;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class P1427 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n=sc.next();
        String[] arr=n.split("");
        Integer[] numArr=new Integer[arr.length];
        int i=0;
        for(var s:arr){
            numArr[i]=Integer.parseInt(s);
            i++;
        }
        Arrays.sort(numArr, Collections.reverseOrder());
        for(int a:numArr){
            System.out.print(a);
        }
    }
}
