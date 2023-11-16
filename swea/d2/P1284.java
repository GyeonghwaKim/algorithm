package swea.d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1284 {
    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int tc=Integer.parseInt(br.readLine());

        for(int i=1;i<=tc;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int P=Integer.parseInt(st.nextToken());
            int Q=Integer.parseInt(st.nextToken());
            int R=Integer.parseInt(st.nextToken());
            int S=Integer.parseInt(st.nextToken());
            int W=Integer.parseInt(st.nextToken());

            int aCost=P*W;
            int bCost=Q+S*((W-R>0)? W-R:0);
            int cost=(aCost>bCost)? bCost:aCost;

            System.out.println("#"+i+" "+cost);

        }
    }
}
