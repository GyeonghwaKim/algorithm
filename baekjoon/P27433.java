package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P27433 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        long n=Long.parseLong(br.readLine());

        System.out.println(factorial(n));

    }

    static long factorial(long a){
        if(a==1|a==0) return 1;
        return a*factorial(a-1);
    }
}
