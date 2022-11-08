package AllJavaLesson;

public class Topic48_NestedLoop_Dowhile {
    public static void main(String[] args) {
        // do {
        //code block
        //}while(condition)

        //print  all the number one to ten
        int i = 1;
        do {
            System.out.println("the number is :" + i);// this code bloc will get executed
            //even if the condition in the while condition is false
i++;// bunu koymadigimizda uzerine ekle demedigimizden sonsuza kadar okuyor
        } while (i <10) ;

    }
}