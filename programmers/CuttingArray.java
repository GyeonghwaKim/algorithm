package programmers;

public class CuttingArray {
    public String[] solution(String my_str, int n) {
        int length=my_str.length();
        String[] answer = new String[(length / n) + 1];
        int index=0;
        for(int i=0;i<=length;i+=n){
            answer[index++]=my_str.substring(i,(i+n<length)?i+n:length+1);
        }
        return answer;
    }
}
