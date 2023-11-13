package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class P28278 {

    static Stack<Integer> stack=new Stack<>();
    static StringBuilder sb=new StringBuilder();

    static void solution(String str) {
        char c = str.charAt(0);

        switch (c) {
            case '1':
                stack.push(Integer.parseInt(str.substring(2)));
                return;
            case '2':
                sb.append(stack.isEmpty() ? -1 : stack.pop()).append("\n");
                return;
            case '3':
                sb.append(stack.size()).append("\n");
                return;
            case '4':
                sb.append(stack.isEmpty() ? 1 : 0).append("\n");
                return;
            case '5':
                sb.append(stack.isEmpty() ? -1 : stack.peek()).append("\n");
                return;
            default:
                break;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        while (N -->0){
            solution(br.readLine());
        }
        br.close();
        System.out.println(sb);
    }
}
