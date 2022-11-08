package AllJavaLesson;

import java.util.Scanner;

public class Topic41_ForloopbitmediConts {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter first number");
        int num1 = scan.nextInt();
        System.out.println("please enter the second number");
        int num2 = scan.nextInt();
        int start;
        int end;
        if ( num1> num2) {

            start = num2;
            end = num1;
        } else {
            start = num1;
            end = num2;

        }
        int sum = 0;
        for (int i = start; i < end; i++) {
            if (i % 2 == 0) {

                sum = sum + i;

            }
        }

        System.out.println("between"+start+end+ sum);

    }
}
