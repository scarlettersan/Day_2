package AllJavaLesson;

public class Topic66_Methodsagain {
    public static void main(String[] args) {


        // define 2 num and print sum of then
        //defin a string variable and print lowercase of it
        //define 2 num and print number from 1 to sum of them
        //define another string and print lowercASE of it
int a =5;
int b=6;


//  int sum = a+b;
        int sum = Add(a,b);
        System.out.println(sum);

//        String s1 = "RenasTech";
//        System.out.println(s1.toUpperCase());
        PrintLowerCase("RenasTECH");

        int c = 7;
        int d = 3;

//        int sum2 = c + d;
        int sum2 = Add(c,d);
        for (int i = 1; i <= sum2 ; i++) {
            System.out.println(i);
        }

//        String s2 = "WhatEVer";
//        System.out.println(s2.toLowerCase());
        PrintLowerCase("WhatEVer");


    }

    public static int Add(int param1, int param2){
        return param1 * param2;
    }

    public static void PrintLowerCase(String param1){
        System.out.println(param1.toUpperCase());
    }






    }
