package AllJavaLesson;

public class Topic50_whileNestedLoops {
    public static void main(String[] args) {
        int i= 0;
        while(i<10){
            System.out.println(i);
            i++;
            int j =1;
            while (j<10){
                System.out.println( "\t"+i+j );
                j++;
            }

        }
    }
}
