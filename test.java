import static java.lang.Integer.*;

public class test {
    public static void main(String[] args) {

        int sum=0;
        String my_string="aaaaaaa";
        String[] arr=my_string.split("[a-zA-z]+");
        for(int i=0;i<arr.length;i++) {
            sum += !arr[i].isBlank() ? Integer.parseInt(arr[i]) : 0;
        }
    }
}
