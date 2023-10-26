package programmers.level01;

import java.util.HashMap;

public class MemoryScore {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];

        HashMap<String,Integer> nameYearning=new HashMap<>();
        for(int i=0;i<name.length;i++){
            nameYearning.put(name[i],yearning[i]);
        }
        for(int i=0;i<photo.length;i++){
            int sum=0;
            for(int j=0;j<photo[i].length;j++){
                if(!nameYearning.containsKey(photo[i][j])) continue;
                int score=nameYearning.get(photo[i][j]);
                sum+=score;
            }
            answer[i]=sum;
        }


        return answer;
    }
}
