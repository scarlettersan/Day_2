package SelfCalismalar;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("this is My Calculater");
        int num1= scan.nextInt();
        int num2= scan.nextInt();
        System.out.println("what kind of operation would you like to do?(*,%,-,+)");
        char islem= scan.next().charAt(0);
int result;
        switch (islem){

            case '+':
                result = num1 + num2;
                System.out.println( num1 + "+"+num2 + "=" +result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println( num1 + "-"+num2 + "=" +result);
                break;
            case '%':
                result = num1 % num2;
                System.out.println( num1 + "%"+num2 + "=" +result);
            break;
            case '*':
                result = num1 * num2;
                System.out.println( num1 + "*"+num2 + "=" +result);
break;
            default:
                System.out.println("select one multiplication ,divided ,plus, minus");






        }
    }
}
