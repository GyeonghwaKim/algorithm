package programmers;

public class HideNumberSecond {
    public int solution(String my_string) {
        int sum=0;
        String[] arr=my_string.split("[a-zA-z]+");
        for(int i=0;i<arr.length;i++) {
            sum += !arr[i].isBlank() ? Integer.parseInt(arr[i]) : 0;
        }
        return sum;
    }

}
