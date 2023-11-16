package swea.d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class P2007 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int tc=Integer.parseInt(br.readLine());
        for(int i=1;i<=tc;i++){

            String str=br.readLine();
            System.out.println("#"+i+" "+routineStr(str));
        }
    }

    static int routineStr(String str){
        for(int j=1;j<str.length();j++){
            if(str.substring(0,j).equals(str.substring(j,2*j))){
                    return j;
            }
        }
        return 1;
    }
}
