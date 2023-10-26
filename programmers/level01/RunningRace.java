package programmers.level01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class RunningRace {
    public String[] solution(String[] players, String[] callings) {
        String[] answer=new String[players.length];

        HashMap<String, Integer> mapPlayer=new HashMap<>();
        HashMap<Integer, String> mapRank=new HashMap<>();

        for(int i=0;i< players.length;i++){
            mapRank.put(i,players[i]);
            mapPlayer.put(players[i],i );
        }

        for(int i=0; i<callings.length;i++){
            int call=mapPlayer.get(callings[i]);
            String player=mapRank.get(call);

            String frontPlayer=mapRank.get(call-1);

            mapPlayer.put(player, call - 1);
            mapPlayer.put(frontPlayer, call);

            mapRank.put(call - 1, player);
            mapRank.put(call, frontPlayer);
        }

        for (int i=0;i< players.length;i++){
            answer[i]=mapRank.get(i);
        }
        return  answer;
    }
}
