package swea.d2;

import java.util.*;
//뒤에서부터 탐색 ,,
public class P1859 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T;
        T=sc.nextInt();
        for(int i=1;i<=T;i++){
            //n개의 자연수
            int n= sc.nextInt();
            //n개의 자연수 받을
            ArrayList<Integer> arrs=new ArrayList<>();
            for (int j=0;j<n;j++){
                arrs.add(sc.nextInt());
            }

            long max=0L;//Collections.max(arrs);
            int num = 0;
            long cost = 0L;		//구매가
            long result = 0L;
            Collections.reverse(arrs);
            for(int arr:arrs){
                if(arr>max){
                    result+=(max*num)-cost;
                    max=arr;
                    cost=0;
                    num=0;
                }else{
                    cost+=arr;
                    num++;
                }
            }
            result+=(max*num)-cost;
            /* &#xACB0;&#xACFC; */
            System.out.println("#"+i+" "+result);
        }

    }
}
