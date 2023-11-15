package swea.d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1926 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int tc=Integer.parseInt(br.readLine());
        StringBuilder sb1=new StringBuilder();


        for(int i=1;i<tc+1;i++){

            StringBuilder sb2=new StringBuilder();
            if(i>100){
                if(((i / 100) == 3) | ((i / 100) == 6) | (i / 100)==9) {
                    sb2.append("-");
                }
                if((i%100)/10==3 | (i%100)/10==6 |(i%100)/10==9) sb2.append("-");

                if((i%10)==3 | (i%10)==6 |(i%10)==9) sb2.append("-");

                if(sb2.length()==0) sb1.append(i).append(" ");
                else sb1.append(sb2).append(" ");

            }else if (i>10){
                if((i/10)==3 | (i/10)==6 |(i/10)==9) sb2.append("-");
                if((i%10)==3 | (i%10)==6| (i%10)==9) sb2.append("-");

                if(sb2.length()==0){
                    sb1.append(i).append(" ");
                }else sb1.append(sb2).append(" ");

            }else if(i>0){
                if(i%3==0) sb1.append("-").append(" ");
                else sb1.append(i).append(" ");
            }
        }


        System.out.println(sb1);
    }
}
