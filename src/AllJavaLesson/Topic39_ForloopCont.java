package AllJavaLesson;

import java.util.Scanner;

public class Topic39_ForloopCont {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("please enter the first number");
        int num1 = sc.nextInt();
        System.out.println("please enter the second number");
        int num2 = sc.nextInt();
        int cnt =0;
        for (int a= num1;a<num2;a++) {
            if (a%2==0)
            cnt++;



        }
        System.out.println(cnt);


    }



    }



