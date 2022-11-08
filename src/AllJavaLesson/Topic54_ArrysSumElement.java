package AllJavaLesson;

import java.util.Scanner;

public class Topic54_ArrysSumElement {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);//user bisi sormak istediginde kullanman gereken scanner dir
        System.out.println("lutfen kac adet oge oldugunu girin ");//please enter the number of elements would you like to add to array


        int size= sc.nextInt();

        double [] numbers= new double[size];

        for (int i = 0; i < size; i++) { // size in yerine num.lenght te kullana bilirsin

            System.out.println("pleae enter the"+(i+1)+".number:");

            double num = sc.nextDouble();
         numbers[i] = num;

        }
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) { // ustteki curly bracket means baska bir loop tan cikmis oluyorsun eger bunu bu looopun icinde kullanmis olsaydim { bunun icinde ozaman bana i vermeyecek j verecekti


            sum = sum + numbers[i];

        }

        System.out.println("the sum of all the numbers in the array is: "+sum);


    }
}
