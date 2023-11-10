package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P1764
{
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Map<String,Integer> map=new HashMap<>();
        ArrayList<String> arrayList=new ArrayList<>();
        StringTokenizer st=new StringTokenizer(br.readLine());

        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        //듣
        for(int i=0;i<n;i++){
            map.put(br.readLine(),1);
        }
        //보
        for(int j=0;j<m;j++){
            String name=br.readLine();
            map.put(name,map.getOrDefault(name,0)+1);
            if(map.get(name)==2) arrayList.add(name);
        }


        Collections.sort(arrayList);
        System.out.println(arrayList.size());
        for(var arr:arrayList) System.out.println(arr);




    }

}
