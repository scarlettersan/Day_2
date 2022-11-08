package AllJavaLesson;

import java.util.Scanner;

public class Topic40_ReverseString {
    public static void main(String[] args) {
        //example hamza==>azmah

        Scanner scan = new Scanner(System.in);

        System.out.println();
        String input = scan.nextLine();
        String name = "hamza";
        char ch = name.charAt(0);
        System.out.println(ch);

        System.out.println(name.length());
        System.out.println(name.charAt(input.length() - 1));



    }
}