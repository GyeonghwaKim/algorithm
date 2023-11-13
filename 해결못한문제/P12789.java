package 해결못한문제;



import java.util.Scanner;
import java.util.Stack;


public class P12789 {


    static Stack<Integer> stack=new Stack<>();
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        int n= sc.nextInt();
        int order=1;

        while (n-- >0){

            int input=sc.nextInt();
            stack.push(input);
            if(stack.peek()==order){
                stack.pop();
                order++;
            }

        }

        while (!stack.isEmpty()){
            if(order==stack.peek()) {
                order++;
                stack.pop();
            }
            else {
                break;
            }
        }
        System.out.println((stack.isEmpty())? "Nice":"Sad");
    }
}
