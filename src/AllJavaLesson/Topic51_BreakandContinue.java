package AllJavaLesson;

public class Topic51_BreakandContinue {
    public static void main(String[] args) {
        for (int i = 0; i <10 ; i++) {
            System.out.println("============"+i);
            for (int j = 0; j < 10; j++) {
                if (i==5){
                    break;

                }
                System.out.println(j );
            }

        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        for (int i = 0; i <10 ; i++) {
            System.out.println("============"+i);
            for (int j = 0; j < 10; j++) {
                if (i==5){
                    continue;

                }
                System.out.println(j );
            }

        }

    }
}
