package AllJavaLesson;

public class Topic47_Continue {
    public static void main(String[] args) {
        int i=1;
        while (i<10){
            if (i==5 || i==8 || i==2){
                i++;
                continue;

            }
            System.out.println(i);
            i++;// eger bunu increse yapmazsan her seferinde basa donup 1 basar eger bunu yaparsan her seferinde bir arttirarak yazar

        }
    }
}
