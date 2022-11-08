package AllJavaLesson;

public class Topic46_WhileBreak {
    public static void main(String[] args) {
        int start=1;
        while(start<10){

            start++;//buraya koydugunda biri sayiyo ve increse ettigini yziyor once

            if (start==5){
                break;
            }
            System.out.println(start);
            //  start++;  //buraya yazdigimizda ise 5 i yazmiyor cunku 5 te break yap dedik
        }

        String name="hamza";
        int i=0;
        while (i<name.length()){
            if (name.charAt(i)=='m'){
                break; // bundan sonrakileri yazmiyor
            }
            System.out.println(name.charAt(i));
            i++;
        }

    }
}
