package AllJavaLesson;

import java.util.Scanner;

public class Topic33_nextvsnextline {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter first name:");
       String name1= scan.nextLine();
        System.out.println("Please enter first age");
                int age1= scan.nextInt();


        System.out.println("please enter second person first name:");
        String name2= scan.next();
        System.out.println("Please enter second person age");
        int age2= scan.nextInt();


        System.out.println("please enter thirt person first name:");
        String name3= scan.next();
        System.out.println("Please enter thirt person age");
        int age3= scan.nextInt();




    }
}
