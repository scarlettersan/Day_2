package AllJavaLesson;

public class Topic37_Stringmethods {
    public static void main(String[] args) {
        String name = "Birgul";
        String Rename= name.replace('B','P');
        System.out.println(Rename);// reassign the name variable to Pirgul

        String name1 = "Bella";
        String Rename1= name1.replaceFirst("Be","Pe");
        System.out.println(Rename1);// reassign the name variable to Pella

String adi= "guven";
boolean checkadi = adi.startsWith("G");
        System.out.println(checkadi);// true or false false because G is upper

        String ismi= "guvenErsan";
       String checkismi = ismi.substring( 4);
       String check = ismi.substring(2,5); // this one shows VEN because 5 is excluded and than in the order next step
        System.out.println(checkismi);
        System.out.println(check);





    }
}
