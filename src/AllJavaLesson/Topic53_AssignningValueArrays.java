package AllJavaLesson;

public class Topic53_AssignningValueArrays {
    public static void main(String[] args) {
        int [] intarrys={9,8,7,6,5,4,};
        int val= intarrys[4];
        System.out.println(val);
        int[]arry1=new int[4];
        arry1[0]=78;
        System.out.println(arry1[0]);

        int[]arr={56,23,1,90,31,54,67,81,100,24};// burda max diye verdigimiz degiskenimiz 0 oda 56 esit

        int max = 0;//asagida i=56 yani sifira diyor bi sonrakinde 56 < arr yani butun oradaki sayilari tek tek
        //kontrol ederek geciyor ve en son buyuk olan hangisi burada 90 artik i 56 degil 90 oluyor
        for (int i = 0; i < arr.length; i++) {
            if (max<arr[i]){
                max = arr[i];

            }
            System.out.println(max);
        }
    }
}
