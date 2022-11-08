package AllJavaLesson;

import java.util.Arrays;

public class Topic55_Split {
    public static void main(String[] args) {
        String name = "birgul guven hamza ipek";
        System.out.println(name);
        String[] nm= name.split("g");
        System.out.println(Arrays.toString(nm));
        System.out.println(nm.length);
        //System.out.println(nm[0]);

        String forbid = "bubirtest ";
        String[] tst = forbid.split("");//"" aralarini acar yada bisi yazarsan harflerin arasini acmiyor
        System.out.println(Arrays.toString(tst));

        String ad = "BirgulGuvenHamzaIpek";
        String [] test = ad.split( "",7);
        System.out.println(Arrays.toString(test));
    }

}
