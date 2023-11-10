package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P1269 {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);

        int A=sc.nextInt();
        int B=sc.nextInt();

        Map<Integer,Integer> map=new HashMap<>();


        for(int i=0;i<A;i++){
            map.put(sc.nextInt(),1);
        }
        for(int i=0;i<B;i++){
            int num=sc.nextInt();
            map.put(num,
                    map.getOrDefault(num,0)+1);
        }

        int cnt=0;
        for(var a:map.values()){
            if(a==1) cnt++;
        }

        System.out.println(cnt);
    }
}
