package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P20920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());

        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());

        Map<String,Integer> map= new HashMap<>();

        while (n-->0){
            String str= br.readLine();
            if(str.length()<m) continue;
            map.put(str,map.getOrDefault(str,0)+1);
        }

        ArrayList<String> arrayList=new ArrayList<>(map.keySet());



        Collections.sort(arrayList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int c1=map.get(o1);
                int c2=map.get(o2);
                //등장 순서 - 1순위
                if(c1==c2){
                    //등장순서가 같다면.. 길이 2 순위
                    if(o1.length()==o2.length()){
                        //3순위 사전순
                        return o1.compareTo(o2);
                    }//2순위
                    return o2.length()-o1.length();
                }//1순위
                return c2-c1;
            }
        });

//        arrayList.sort((o1, o2) -> {
//            int c1=map.get(o1);
//            int c2=map.get(o2);
//
//            if(c1==c2){
//                if(o1.length() == o2.length()) {
//                    return o1.compareTo(o2);
//                }
//                return o2.length()-o1.length();
//            }
//            return c2-c1;
//        });

        StringBuilder sb=new StringBuilder();
        for(int i=0; i <arrayList.size(); i++){
            sb.append(arrayList.get(i)).append("\n");
        }
        System.out.println(sb);

    }

}
