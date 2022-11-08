package AllJavaLesson;

public class Topic52_Arrays {
    public static void main(String[] args) {
        // variable:
        //datatype name= value;
        //arrays
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);

        }

        int[] intArry= new int[4];
        double[] doubleArray= new double[3];
        System.out.println(doubleArray[1]);// hic bir arry koymazsan sadece arry lokasyonunu gosteriyor
        //cunku int default gelen sayisi eger sen vermezsen 0 dir



        char[] charArry= new char[4];
        System.out.println(charArry[1]);



    }
}
