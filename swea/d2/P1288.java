package swea.d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class P1288 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int tc=Integer.parseInt(br.readLine());

        for(int i=1;i<=tc;i++){
            int n=Integer.parseInt(br.readLine());
            Set<String> set=new HashSet<>();
            int cnt=1;
            while (true){
                String str= String.valueOf(n*cnt);
                for (String s:str.split("")){
                    set.add(s);
                }
                if(set.size()==10) break;
                cnt++;
            }

            System.out.println("#"+i+" "+n*cnt);
        }
    }
}
