package regex;

import java.util.Arrays;

public class Regex {
    public static void main(String[] args) {
        String text = "The quick     brown fox jumps over the lazy dog";
        String text2 = " The quick  fox jumps over the l a zy dog12345678aa a brown";
        String text3 = "";
        String text4 = "        ";
        String text5 = "quick";


        String phone1 = "+37061234567";
        String phone2 = "861234567";
        String phone3 = "+61234567";

        String pattern = "^(\\+370|8)\\d{8}$";

        // "." - bet koks simbolis
        //text = text.replaceAll(".", "#");

        // "^" - teksto pradzia
        // text = text.replaceAll("^The", "#");

        // '$' - pabaiga teksto
        //text = text.replaceAll("dog$", "#");

        // [abc] - pakeicia nurodytas raides tekste
        //text = text.replaceAll("[abc]", "#");

        // [a][b] - pakeicia raides is a masivo bet po a masivo turi butinai but b masivo raides: The qui# brown fox jumps over the l#y dog
        //text = text.replaceAll("[abc][kz]", "#");

        // [^abc] - viska pakecia isskyrus abc
        //text = text.replaceAll("[^abc]", "#");

        // [a-d1-7] - pakeicia reiksmes nurodytame range
        //text2 = text2.replaceAll("[a-d1-7]", "#");

        // "zy" - pakeicia nurodtysa raides kurios yra viena po kitos
        //text = text.replaceAll("zy", "#");

        // #The quick brown fox jumps over the lazy dog
        //text = text.replaceAll("^", "#");

        //The quick brown fox jumps over the lazy dog#
        //text = text.replaceAll("$", "#");

        // \d = [0-9] -> The quick brown fox jumps over the lazy dog#########
        //text2 = text2.replaceAll("\\d", "#");

        // \d = [^0-9] -> ###########################################123456789
        //text2 = text2.replaceAll("\\D", "#");

        // \s -> The#quick#brown#fox#jumps#over#the#lazy#dog
        //text = text.replaceAll("\\s", "#");

        // \S -> ### ##### ##### ### ##### #### ### #### ###
        //text = text.replaceAll("\\S", "#");

        // \w == [a-zA-Z_0-9] -> ### ##### ##### ### ##### #### ### #### ############
        //text2 = text2.replaceAll("\\w", "#");

        // The#quick#brown#fox#jumps#over#the#lazy#dog123456789
        //text2 = text2.replaceAll("\\W", "#");

        //#The# #quick# #brown# #fox# #jumps# #over# #the# #lazy# #dog#
        //text = text.replaceAll("\\b", "#");

        //The quick brown fox jumps over the lazy dog##78aa
        //text2 = text2.replaceAll("\\d{3}", "#");

        //The # # fox # over the lazy dog
        //text = text.replaceAll("\\w{5}", "#");

        //The # # fox # # the # dog
        //text = text.replaceAll("\\w{4,5}", "#");


        //kartojasi 0 ar daugiau kartu atitinka {0,} -> The quick brown fox jumps over the l#zy dog12345678##
        //text2 = text2.replaceAll("[a]*", "#");

        //kartojasi 0 ar daugiau kartu atitinka {1,} -> The quick brown fox jumps over the l#zy dog12345678##
        //text2 = text2.replaceAll("[a+]", "#");

        //true
//        System.out.println(text.matches(".*brown.*"));

        //[The, quick, , , , , brown, fox, jumps, over, the, lazy, dog]
//        System.out.println(Arrays.toString(text.split("\\s+")));

//        text = text.replaceAll("\\s+", " " );


//        System.out.println(text);
//        System.out.println(text2);
//        System.out.println(text3);
        System.out.println(Arrays.toString(text5.split("")));

//        System.out.println(phone1.matches(pattern));
//        System.out.println(phone2.matches(pattern));
//        System.out.println(phone3.matches(pattern));
    }
}
