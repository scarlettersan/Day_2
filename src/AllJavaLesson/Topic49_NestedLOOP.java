package AllJavaLesson;

public class Topic49_NestedLOOP {
    public static void main(String[] args) {
        //nestedloops
        for (int i = 0; i < 3; i++) {
            System.out.println(i);
            for (int j = 1; j <=10; j++) {
                System.out.println("fruit"+i+j);

            }
        }
    }
}
