package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class P26069 {

    static Map<String,Integer> map= new HashMap<>();
    static int danceCnt=0;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int N=Integer.parseInt(br.readLine());

        map.put("ChongChong",1);


        while (N-->0){
            StringTokenizer st=new StringTokenizer(br.readLine());

            String name1=st.nextToken();
            String name2=st.nextToken();
            map.put(name1,map.getOrDefault(name1,0));
            map.put(name2,map.getOrDefault(name2,0));

            if(map.get(name1)==1 | map.get(name2)==1){
                map.put(name1,1);
                map.put(name2,1);
            }

        }

        for(Map.Entry<String, Integer> entry: map.entrySet()){
            if(entry.getValue()==1) {
                danceCnt++;
            }
        }
        System.out.println(danceCnt);
    }
}
