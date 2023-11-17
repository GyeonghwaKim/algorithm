package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class P25192 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int tc=Integer.parseInt(br.readLine());

        HashSet<String> hs=new HashSet<>();
        int cnt=0;

        while(tc-- >0){
            String str=br.readLine();
            if(str.equals("ENTER")){
                hs=new HashSet<>();
                continue;
            }

            if(!hs.contains(str)){
                hs.add(str);
                cnt++;


        }
    }
        br.close();
        System.out.println(cnt);
}}
