package programmers.basic;
//보류
public class Babbling {
    //"aya", "ye", "woo", "ma"

    public int solution(String[] babbling) {
        String[] babbligAnswer={"aya", "ye", "woo", "ma"};
        int answer =0;
        for(String word:babbling){
            for(String ans:babbligAnswer){
                if(word.equals(ans)){
                    answer++;
                }
            }
        }
        return answer;
    }
}
