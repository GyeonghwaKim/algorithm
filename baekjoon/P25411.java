package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class P25411 {

    static Deque<Integer> deque=new ArrayDeque<>();
    static int pop;

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();

        int N=Integer.parseInt(br.readLine());
        StringTokenizer st1=new StringTokenizer(br.readLine());
        StringTokenizer st2=new StringTokenizer(br.readLine());

        while (st1.hasMoreTokens()){
            int kind=Integer.parseInt(st1.nextToken());
            int value=Integer.parseInt(st2.nextToken());
            if (kind==0){
                deque.add(value);
            }
        }

        int M=Integer.parseInt(br.readLine());
        StringTokenizer st3=new StringTokenizer(br.readLine());

        while (M-- >0){
            int value=Integer.parseInt(st3.nextToken());
            deque.addFirst(value);
            sb.append(deque.pollLast()).append(" ");

        }
        System.out.println(sb);


    }

}