package AllJavaLesson;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Topic45_WhileCont {
    public static void main(String[] args) {
        // write a code ehre user is beign asked to enter 2 number and sum all the number
        //in between those two numbers

        Scanner scan = new Scanner(System.in);

        System.out.println("please enter the first number: ");

        int num1 = scan.nextInt();
        System.out.println("please enter second number: ");
        int num2 = scan.nextInt();
        int i;
        int j;
        if (num1 > num2) {
i = num2;
j=num1;
        }else{
            i =num1;
            j =num2;
        }
        int sum =0;
        while (i<j){

          if (i%5==0){
              sum+=i;
              i++;

          }




          sum+=i;
          i++;
        }
        System.out.println(sum);
    }
}