package programmers.level01;

import java.util.ArrayList;
import java.util.HashMap;

public class PrivateInfo {
    public int[] solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> answer=new ArrayList<>();
        HashMap<String,Integer> map=new HashMap<>();

        int date=getDate(today);


        for (String term:terms){
            String[] arr=term.split(" ");
            map.put(arr[0],Integer.parseInt(arr[1]));
        }
        for (int i=0;i<privacies.length;i++){
            String[] privacy=privacies[i].split(" ");

            if(getDate(privacy[0])+(map.get(privacy[1])*28)<=date){
                answer.add(i+1);
            }
        }

        return answer.stream().mapToInt(integer ->integer).toArray();

    }

    public int getDate(String s){
        String[] date=s.split("\\.");
        int year=Integer.parseInt(date[0]);
        int month=Integer.parseInt(date[1]);
        int day=Integer.parseInt(date[2]);
        return (year*12*28)+(month*28)+day;
    }
    }

