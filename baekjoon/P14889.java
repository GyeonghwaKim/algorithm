package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P14889 {

    static int n;
    static int[][] map;
    static boolean[] visit;
    static int min=Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        n=Integer.parseInt(br.readLine());

        map=new int[n][n];
        visit=new boolean[n];

        for(int i=0;i<n;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());

            for(int j=0;j<n;j++){
                map[i][j]=Integer.parseInt(st.nextToken());
            }
        }

        combi(0,0);
        System.out.println(min);

    }

    static void combi(int idx,int cnt){

        if(cnt == n / 2) {
			/*
			 방문한 팀과 방문하지 않은 팀을 각각 나누어
			 각 팀의 점수를 구한 뒤 최솟값을 찾는다.
			*/
            diff();
            return;
        }

        for(int i = idx; i < n; i++) {
            // 방문하지 않았다면?
            if(!visit[i]) {
                visit[i] = true;	// 방문으로 변경
                combi(i + 1, cnt + 1);	// 재귀 호출
                visit[i] = false;	// 재귀가 끝나면 비방문으로 변경
            }
        }



    }

    static void diff(){
        int team_start=0;
        int team_link=0;

        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(visit[i] == true && visit[j] == true){
                    team_start+=map[i][j];
                    team_start+=map[j][i];
                }
                else if (visit[i]==false && visit[j]==false){
                    team_link+=map[i][j];
                    team_link+=map[j][i];
                }
            }
        }
        int val=Math.abs(team_start-team_link);

        if(val==0){
            System.out.println(val);
            System.exit(0);
        }
        min=Math.min(val,min);
    }
}
