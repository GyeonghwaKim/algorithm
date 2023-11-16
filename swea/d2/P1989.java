package swea.d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1989
{
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int tc=Integer.parseInt(br.readLine());
;

        for(int i=1;i<=tc;i++){
            String str=br.readLine();
            StringBuilder sb1=new StringBuilder(str);
            StringBuilder sb2=new StringBuilder(str);
            sb2.reverse().toString();
            if(sb1.substring(0,sb1.length()/2)
                    .equals(sb2.substring(0,sb2.length()/2))){
                System.out.println("#"+i+" "+1);
            }else System.out.println("#"+i+" "+0);
        }


    }
}
