package AllHomeWork;

import java.util.Scanner;

public class Topic_HomeWork18 {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.println("enter int110 number");
            int num1 = scan.nextInt();
            int factor = 1;
            for (int i = 1; i <=num1; i++) {
                factor*=i;
            }
            System.out.println("the Factorial of the number " + num1 + " is: " + factor + ".");;
        }
    }

