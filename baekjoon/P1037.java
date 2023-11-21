package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1037 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int n=Integer.parseInt(br.readLine());

        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        StringTokenizer st=new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()){
            int num=Integer.parseInt(st.nextToken());
            max=(max>num)? max:num;
            min=(min>num)? num:min;

        }

        System.out.println(max*min);
    }
}
