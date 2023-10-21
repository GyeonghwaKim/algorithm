package programmers;

import java.util.Arrays;

public class OnceNum {

    public String solution(String n){
        String answer="";
        String[] arr=n.split("");
        int cnt=0;
        Arrays.sort(arr);

        for(String str:arr){
            cnt=0;
            for (int j=0;j<arr.length;j++){
                if(str.equals(arr[j])) {
                    cnt++;
                }
            }
            if(cnt==1){
                answer+=str;

            }

        }
        return answer;
    }
}
