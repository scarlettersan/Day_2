package AllJavaLesson;

import java.util.Arrays;

public class Topic57_ArryEqual {
    public static void main(String[] args) {
        int[] numara= {3,4};
        int[] numara1= {3,4};
        System.out.println(Arrays.equals(numara,numara1)); // this is boolean

        char [] ch = {'R','T'};
        char [] ch1 = {'r','T'};
        System.out.println(Arrays.equals(ch,ch1));

        int [] num={7,8,9};
        int[] num1=num;
        System.out.println(Arrays.toString(num1));

    }
}
