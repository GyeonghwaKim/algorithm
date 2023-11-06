package baekjoon;

import java.util.Scanner;

public class P10101 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A= sc.nextInt();
        int B= sc.nextInt();
        int C= sc.nextInt();

        int sum=A+B+C;
        //세각의 크기가 같은 경우
        if(A==60&&B==60&&C==60){
            System.out.println("Equilateral");
        } else if (sum==180&&(A==B|B==C|A==C)) {
            System.out.println("Isosceles");
        } else if (sum!=180) {
            System.out.println("Error");
        }else System.out.println("Scalene");
    }
}
