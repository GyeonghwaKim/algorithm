package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;


public class P28279 {

    static Deque<Integer> q=new LinkedList<>();
    static StringBuilder sb=new StringBuilder();
    public static int first(){
        if(q.isEmpty()){
            return -1;
        }
        return q.pollFirst();
    }

    public static int last(){
        if(q.isEmpty()){
            return -1;
        }
        return q.pollLast();
    }

    public static int size(){
        return q.size();
    }

    public static int isEmpty(){
        if(q.isEmpty()) return 1;
        return 0;
    }
    public static int getFirst(){
        if(q.isEmpty()){
            return -1;
        }
        return q.getFirst();
    }

    public static int getLast(){
        if(q.isEmpty()){
            return -1;
        }
        return q.getLast();
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int n=Integer.parseInt(br.readLine());
        while (n-->0){
            String m= br.readLine();
            String[] arr=m.split(" ");
            if(arr[0].equals("1")){
                q.push(Integer.parseInt(arr[1]));
            } else if (arr[0].equals("2")) {
                q.add(Integer.parseInt(arr[1]));
            }else if (arr[0].equals("3")) {
                sb.append(first()).append("\n");
            }
            else if (arr[0].equals("4")) {
                sb.append(last()).append("\n");

            }
            else if (arr[0].equals("5")) {
                sb.append(size()).append("\n");

            }
            else if (arr[0].equals("6")) {
                sb.append(isEmpty()).append("\n");
            }
            else if (arr[0].equals("7")) {
                sb.append(getFirst()).append("\n");

            }
            else if (arr[0].equals("8")) {
                sb.append(getLast()).append("\n");
            }
            }
        System.out.println(sb);

        }
    }

