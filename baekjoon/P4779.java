package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P4779 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String str;
        while ((str=br.readLine())!=null){
            int n=Integer.parseInt(str);

            result=new StringBuilder();

            int num=(int) Math.pow(3,n);
            for(int i=0;i<num;i++){
                result.append("-");
            }

            routine(0,num);
            System.out.println(result);
        }


    }

    static StringBuilder result;
    static void routine(int start, int newLen){
        if(newLen==1) return;

        int len=newLen/3;

        int last=start+len*2;

        for(int i=start+len;i<last;i++){
            result.setCharAt(i,' ');
        }

        routine(start,len);
        routine(last,len);

    }


}
