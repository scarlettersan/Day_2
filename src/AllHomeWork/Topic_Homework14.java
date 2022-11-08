package AllHomeWork;

import java.util.Scanner;

public class Topic_Homework14 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a name: ");
        String name = scan.next();
        if (name.startsWith("A") && name.endsWith("L")) {
            String newName = name.replaceFirst("A", "B");
            System.out.println(newName);
        } else {
            System.out.println(name + " does not start with A and end with L!");
        }
    }
}