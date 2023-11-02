package swea.d3;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
//dfs
public class P1244 {
    static String[] arr;
    static int max,changeCnt;
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        //테케 횟수 받기 3
        int Tc=sc.nextInt();

        for(int i=1;i<=Tc;i++){
            //123
            arr=sc.next().split("");
            //1
            changeCnt= sc.nextInt();
            max=0;

            if(arr.length<changeCnt){
                changeCnt=arr.length;
            }
            dfs(0,0);
            System.out.println("# "+i+" "+max);

        }
        }

        static void dfs(int start,int cnt){
            if(cnt==changeCnt){
                String result="";
                for(String s:arr){
                    result+=s;
                }
                max=Math.max(max,Integer.parseInt(result));
                return;}
            for(int i=start;i<arr.length;i++){
                for(int j=i+1;j<arr.length;j++){
                    //swap
                    String temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                    dfs(i,cnt+1);
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }

        }
    }

