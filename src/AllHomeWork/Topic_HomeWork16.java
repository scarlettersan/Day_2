package AllHomeWork;

import java.util.Scanner;

public class Topic_HomeWork16 {
    public static void main(String[] args) {





        /*
        Write a code where it meets the below requirements
- a couple just got married and goes to city hall to get their last name changed
- the officer who works there asks the couple about their first name and last name for each
- also asks if they want to use the same last name or keep their original last names ( for the same last name you can use either one of them)
- based on the answer print the couples first names and last names

         */

        Scanner sc = new Scanner(System.in);

        System.out.println("What is your Name mam: ");
        String nameM = sc.nextLine();
        System.out.println(" Lastname please: ");
        String lnameM = sc.nextLine();
        System.out.println("What is your Name sir: ");
        String nameW = sc.nextLine();
        System.out.println(" Lastname please: ");
        String lnamew = sc.next();
        System.out.println("If you want to use same lastname please enter 1 or if you want to keep your last name please enter 2");
        int same = sc.nextInt();
        if (same == 1) {
            System.out.println("Your new Full Name is sir  " + nameW.concat("  " + lnamew));
            System.out.println("You new Full Name is mam:     " + nameM.concat("  " + lnameM));
        } else if (same == 2) {
            System.out.println("Your new Full Name is sir:  " + nameW.concat("  " + lnameM));
            System.out.println("You new Full Name is mam:     " + nameM.concat("  " + lnameM));
        } else {
            System.out.println("Please enter valid number");

        }


    }
}
