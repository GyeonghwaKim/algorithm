package baekjoon;

import java.util.*;

public class P7785 {
    static Map<String,String> map=new HashMap<String,String>();
    static ArrayList<String> arrayList=new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();

        for(int i=0;i<n;i++){
            map.put(sc.next(), sc.next());
        }

        for(var key:map.keySet()){
            if(map.get(key).equals("enter")) arrayList.add(key);
        }

        Collections.sort(arrayList,Collections.reverseOrder());

        for(var arr:arrayList) System.out.println(arr);

}}
