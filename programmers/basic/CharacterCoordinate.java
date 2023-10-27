package programmers.basic;

public class CharacterCoordinate {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[board.length];
        int u = 0;
        int r = 0;
        for (String word : keyinput) {
            if (word.equals("up")) {
                if (u >= (board[1] / 2)) {
                    continue;
                }
                u++;
            }
            if (word.equals("down")) {
                if (u < -(board[1] / 2)) {
                    continue;
                }
                u--;
            }
            if (word.equals("left")) {
                if (r < -(board[0] / 2)) {
                    continue;
                }
                r--;
            }
            if (word.equals("right")) {
                if (r >= (board[0] / 2)) {
                    continue;
                }
                r++;
            }
        }
        answer[0] = r;
        answer[1] = u;

        return answer;
    }
}

