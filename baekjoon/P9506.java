package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class P9506 {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        while(true){
        int n=sc.nextInt();
        if(n==-1) break;

        int sum=0;
        ArrayList<Integer> arrayList=new ArrayList<>();

        for(int i=1;i<n;i++){
            if(n%i==0){
                sum+=i;
                arrayList.add(i);
        }}
        if(sum==n){
            System.out.print(n+" = ");
            for(int a:arrayList){
                if(a==((arrayList.get(arrayList.size()-1)))){
                System.out.println(arrayList.get(arrayList.size()-1));
                break;}
                System.out.print(a+" + ");
            }


        }else{
            System.out.println(String.format("%d is NOT perfect.",n));
        }

        }
    }
}
