package programmers.recommend;
//0 ≤ a, b ≤ 10^9
//1 ≤ g의 길이 = s의 길이 = w의 길이 = t의 길이 = 도시 개수 ≤ 10^5
//0 ≤ g[i], s[i] ≤ 10^9
//1 ≤ w[i] ≤ 10^2
//1 ≤ t[i] ≤ 10^5
//a ≤ g의 모든 수의 합
//b ≤ s의 모든 수의 합
public class CarryingGoldSilver {
    public long solution(int a, int b, int[] g, int[] s, int[] w, int[] t) {
        long answer=(long)(10e9*2*10e5*2);
        //도시까지 거리
        int cityLength=g.length;
        //이분 탐색
        long start=0;
        long end=(long)(10e9*2*10e5*2); //최악 경우의 시간

        while(start<=end){
            long mid=(start+end)/2;
            int gold=0;
            int silver=0;
            int add=0;

            for (int i=0;i<cityLength;i++){
                int nowG=g[i];
                int nowS=s[i];
                int nowW=w[i];
                long nowT=t[i];

                long moveCnt=mid/(nowT*2);
                if (mid%(nowT*2)>=t[i]){
                        moveCnt++;
                }
                gold+=Math.min(nowG,moveCnt*nowW);
                silver+=Math.min(nowS,moveCnt*nowW);
                add+=Math.min(nowG+nowS,moveCnt*nowW);
            }
            if(a<=gold&&b<=silver&&a+b<=add){
                end=mid-1;
                answer=Math.min(mid,answer);
                continue;
            }
            start=mid+1;
        }
        return  answer;

    }
}
