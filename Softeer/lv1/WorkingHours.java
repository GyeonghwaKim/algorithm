package Softeer.lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.StringTokenizer;

public class WorkingHours {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        long answer=0;

        for(int i=0;i<5;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            LocalTime startTime=LocalTime.parse(st.nextToken());
            LocalTime endTime=LocalTime.parse(st.nextToken());

            answer+= ChronoUnit.MINUTES.between(startTime,endTime);

        }
        System.out.println(answer);
    }

}
