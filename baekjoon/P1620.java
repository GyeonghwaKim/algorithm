package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P1620 {

    static int N;
    static int M;
    static Map<String,Integer> nameMap=new HashMap<>();
    static Map<Integer,String> indexMap=new HashMap<>();


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());


        for (int i = 0; i < N; i++) {
            String name = br.readLine();
            nameMap.put(name,i+1);
            indexMap.put(i+1,name);
        }

        StringBuilder sb = new StringBuilder();
        while (M-- > 0) {
            String input = br.readLine();
            if(nameMap.containsKey(input)){
                sb.append(nameMap.get(input)).append("\n");
            }else{
                sb.append(indexMap.get(Integer.parseInt(input))).append("\n");
            }
        }
        System.out.println(sb);

    }


}