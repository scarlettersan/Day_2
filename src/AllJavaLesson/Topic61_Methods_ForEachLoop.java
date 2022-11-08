package AllJavaLesson;

public class Topic61_Methods_ForEachLoop {
    public static void main(String[] args) {
        String [] Animals= {"Cat","Dog","Rabbit","Bird"};
        for (String animal:Animals){
            System.out.println(animal);
            if (animal.contains("o")||animal.contains("O"));
            System.out.println(animal);

            String [ ] hayvanlar ={"Cow","Fish","Horse","Lion","Croco","Eagle"};
            for (String var:hayvanlar){
                System.out.println(var);

            int count =0;
            char [ ] letters = var.toCharArray();
            for (char letter:letters){
                if (letter=='c' || letter == 'C'){
                    count++;
                }


            }
                System.out.println(var+count);
        }
    }
}
}