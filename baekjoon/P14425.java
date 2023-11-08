package baekjoon;

import java.util.*;

public class P14425
{
    private static Set<String> set=new HashSet<String>();
    private static ArrayList<String> arrayList=new ArrayList<String>();
    static int cnt=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        for(int i=0;i<n;i++) set.add(sc.next());
        for(int j=0;j<m;j++) arrayList.add(sc.next());

        //입력 끝

        for(var arr:arrayList){
            if(set.contains(arr)){
                cnt++;
            }
        }

        System.out.println(cnt);

    }
}
