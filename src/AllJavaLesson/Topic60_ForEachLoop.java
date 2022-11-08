package AllJavaLesson;

public class Topic60_ForEachLoop {
    public static void main(String[] args) {
        String[] isim = {"hamza", "ipek", "guven", "birgul"};
        for (int i = 0; i < isim.length; i++) {
            System.out.println(isim[i]);
            for (String name : isim) {
                System.out.println(name);
                if (name.contains("a") || name.contains("e")) ;
                {

                    System.out.println(name);
                }
                    System.out.println(name);

            }
        }
    }
}
/*once geldi hamza icin hamza(hamza ipek guven birgul)
             dondu ve ipek icin yazdi ipek(hamza ipek guven birgul)
             dondu ve guven icin yazdi guven(hamzaipek guven birgul)
             dondu ve birgul icin yazdi birgul (hamza ipke guven birgul)
 */