package swea.d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P1204 {

    static int index;

    static Integer key2;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int TC=Integer.parseInt(br.readLine());

        while (TC-- >0){
            int maxKey= Integer.MIN_VALUE;
            int num=Integer.parseInt(br.readLine());
            StringTokenizer st=new StringTokenizer(br.readLine());

            Map<Integer,Integer> map= new HashMap<>();

            while(st.hasMoreTokens()){
                int key=Integer.parseInt(st.nextToken());
                if(map.containsKey(key)){
                    index=map.get(key);
                    map.put(key,index+1);
                }else{
                    map.put(key,0);
                }
            }
            Integer maxValue= Collections.max(map.values());

            for(Map.Entry<Integer,Integer> entry:map.entrySet()){
                if(entry.getValue()==maxValue){
                    maxKey=(maxKey>entry.getKey())? maxKey:entry.getKey();
                }
            }

            System.out.println("#"+num+" "+maxKey);
        }


    }
}
