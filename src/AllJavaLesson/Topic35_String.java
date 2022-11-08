package AllJavaLesson;

public class Topic35_String {

    public static void main(String[] args) {

        String birgul = "hello";
        String guven = "hello";
        String Hamza = new String("hello");

        boolean isEqual = birgul==guven;
        System.out.println("are they equal:"+isEqual);
        System.out.println("are the others equal:" +(guven== Hamza));
    }
}
