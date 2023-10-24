package programmers;

public class OXQuiz {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        int i=0;
        for(String a:quiz){
            String[] arr=a.split(" ");
            int num1=Integer.parseInt(arr[0]);
            int num2=Integer.parseInt(arr[2]);
            int num3=Integer.parseInt(arr[4]);
            if (arr[1].equals("+")) {
                answer[i++]=(num1+num2==num3)?"O":"X";

            }else{
                answer[i++]=(num1-num2==num3)?"O":"X";

            }
        }
        return answer;
    }
}
