package programmers;

public class NearNum {
    public int solution(int[] array, int n) {
        int answer = array[0];

        for (int num:array){
            if (Math.abs(n-answer)==Math.abs(n-num)){
                answer=n-answer>n-num? answer:num;
            }else answer = (Math.abs(n - answer) > Math.abs(n - num)) ? num : answer;
        }
        return answer;
    }
}
