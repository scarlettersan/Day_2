package AllJavaLesson;

public class Topic65_AutoBoxingAndUnBoxing {
    public static void main(String[] args) {
        Integer i = new Integer(10);

        //unboxing to object
        int i1= i;
        System.out.println(i1);
        //boxing
        int i2= 5;
        Integer i3 =i2;
    }
}
