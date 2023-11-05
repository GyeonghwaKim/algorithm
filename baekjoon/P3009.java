package baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class P3009 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        ArrayList<Integer> xArrList=new ArrayList<>();
        ArrayList<Integer> yArrList=new ArrayList<>();

        for(int i=0;i<3;i++){
            int x= sc.nextInt();
            int y=sc.nextInt();

            if(xArrList.contains(Integer.valueOf(x))) xArrList.remove(Integer.valueOf(x));
            else xArrList.add(x);
            if(yArrList.contains(Integer.valueOf(y))) yArrList.remove(Integer.valueOf(y));
            else yArrList.add(y);
        }

        int A=xArrList.get(0);
        int B=yArrList.get(0);
        System.out.println(A+" "+B);

    }
}
