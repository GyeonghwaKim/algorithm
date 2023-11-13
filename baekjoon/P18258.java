package baekjoon;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P18258 {
    static Deque<Integer> queue=new LinkedList<>();
    static StringBuilder sb=new StringBuilder();
    public static void push(int a){
        queue.add(a);
    }
    public static int pop(){
        if(queue.isEmpty()) return -1;
        return queue.pop();
    }
    public static int size(){
        return queue.size();
    }
    public static int empty(){
        if(queue.isEmpty()) return 1;
        return 0;
    }
    public static int front(){
        if(queue.isEmpty()) return -1;
        return queue.getFirst();
    }
    public static int back(){
        if(queue.isEmpty()) return -1;
        return queue.getLast();
    }


    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int N= Integer.parseInt(br.readLine());

        for(int i=0;i<N;i++){
            String str=br.readLine();
            String[] inputs=str.split(" ");

            if(inputs[0].equals("push")){
                push(Integer.parseInt(inputs[1]));
            }else if(inputs[0].equals("pop")){
                sb.append(pop()).append("\n");
            } else if (inputs[0].equals("size")) {
                sb.append(size()).append("\n");
            }else if(inputs[0].equals("empty")){
                sb.append(empty()).append("\n");
            }else if(inputs[0].equals("front")){
                sb.append(front()).append("\n");
            }else if(inputs[0].equals("back")){
                sb.append(back()).append("\n");
            }
        }
        System.out.println(sb);

    }
}
