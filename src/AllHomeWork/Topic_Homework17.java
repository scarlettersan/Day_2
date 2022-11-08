package AllHomeWork;

import java.util.regex.Pattern;

    import javax.xml.soap.Text;

public class Topic_Homework17 {
public static void main( String[] args )
        {
            /* hello my name is birgul.       i am 42 years old.  i live in dallas.
             I have been in IT industry for about 6 years. I STarted as MAnual TESter and NOW I am doiNG AuTomaTion Testing.
             I have experience in EducatION, energy,finance and some manY Other AREAs.
              i HAve scrum master and Oracle java Programmer certificates.   i love JaVA.
                I designed and DEVELoped many automation test cases using BDD FRamework.
              */




            /*First create one string and copy paste below paragraf.
And make modifications on the given paragraph listed below.
Make sure to create multiple string with each sentence from given paragraph
Make sure each sentence start with upper case letter.
Make sure city name start with the capital letter.
Make sure the rest of the letters are lower case.
Make sure to change the name, age and city information based on your information
make sure to get rid of the empty spaces in front and end of the sentences.
after you make the modification check each sentense’s length
Print each sentence and make sure they are correctly modified.
Print 1st, 4th and 5th indexed characters for each sentence
At the end combine all the sentence to get proper paragraph with modified sentences*/



            String mystring ="hello my name is <yourname>.  i am <yourage> years old.  i live in <yourcity>.  I have been in IT industry for about 6 years. I STarted as MAnual TESter and NOW I am doiNG AuTomaTion Testing. I have experience in EducatION, energy,finance and some manY Other AREAs. i HAve scrum master and Oracle java Programmer certificates.   i love JaVA.   I designed and DEVELoped many automation test cases using BDD FRamework.";
            String[] sentences = mystring.split(Pattern.quote("."));
            for (int i = 0; i<sentences.length;i++){
                sentences[i] = sentences[i].trim();
                sentences[i] = sentences[i].substring(0,1).toUpperCase() + sentences[i].substring(1).toLowerCase();
                sentences[i] = sentences[i].replace("<yourname>", "Scarlett");
                sentences[i] = sentences[i].replace("<yourage>", "42");
                sentences[i] = sentences[i].replace("<yourcity>", "Dallas");
                System.out.println(sentences[i]);
            }

            for (int i= 0;i<sentences.length;i++){
                System.out.print("Sentence "+(i+1)+", 1st, 4th and 5th indexed characters are : ");
                System.out.print(sentences[i].substring(0,1)+", ");
                System.out.print(sentences[i].substring(3,4)+", ");
                System.out.println(sentences[i].substring(4,5));
            }
            String newstring = "";
            for (int i= 0;i<sentences.length;i++){
                newstring = newstring.concat(sentences[i]).concat(". ");
            }

            System.out.println(newstring);
        }
    }





