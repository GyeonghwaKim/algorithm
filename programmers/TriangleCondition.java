package programmers;



public class TriangleCondition {
    public int solution(int[] sides) {
        int answer = 0;
        //가장긴변이 배열에 있는경우
        int maxNum=Math.max(sides[0],sides[1]);
        int minNum=Math.min(sides[0],sides[1]);
        int num=maxNum-minNum;
        while (true){
            if(num>maxNum){
                break;
            }
            answer++;
            num++;
        }
        //나머지가 긴변인 경우
        num=maxNum+1;
        while (true){
            if (minNum+maxNum<num){
                break;
            }
            answer++;
            num++;

        }
        return answer;
    }
}
