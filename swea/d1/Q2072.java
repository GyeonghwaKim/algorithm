package swea.d1;

import java.util.Scanner;

public class Q2072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++)
        {
            int sum=0;
            for(int i=0;i<10;i++){
                int num=sc.nextInt();
                if(num%2==1) sum+=num;
            }
            System.out.println(String.format("#%d %d",test_case,sum));
        }

    }
}
