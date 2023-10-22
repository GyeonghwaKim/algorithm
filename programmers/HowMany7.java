package programmers;

public class HowMany7 {
    public int solution(int[] array) {
        int answer = 0;
        for(int num:array){
            String str=Integer.toString(num);
            String[] arr=str.split("");
            for(String word:arr){
                if(word.equals("7")){
                    answer++;
                }
            }
        }
        return answer;
    }
}
