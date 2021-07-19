import java.util.Arrays;
import java.util.Locale;

public class Homework4 {

    public static void main(String[] args) {


        // Question - 1:
        /**
         * String threeWordSentence = "hApPy nEW yeAr"
         * // code
         * String threeWordSentence = "Happy New Year"
         */
        String threeWordSentence_1 = "hApPy nEW yeAr";

        System.out.println("Before code : " + threeWordSentence_1);     // "hApPy nEW yeAr"

        String[] splitSentence = threeWordSentence_1.toLowerCase().split(" ");

        String firstChar = splitSentence[0].substring(0, 1).toUpperCase();
        String secChar = splitSentence[1].substring(0, 1).toUpperCase();
        String thirdChar = splitSentence[2].substring(0, 1).toUpperCase();

        String firstWord = splitSentence[0].substring(1);
        String secWord = splitSentence[1].substring(1);
        String thirdWord = splitSentence[2].substring(1);

        String result = firstChar + firstWord +" " + secChar + secWord +" " + thirdChar + thirdWord;

        System.out.println("After code : " + result);



        // Question - 2:
        /**
         * create the abbreviation  // HNY
         */
        String threeWordSentence_2 = "very gOOD MorNING";
        String abbr = "";

        String[] splitSentence2 = threeWordSentence_2.toUpperCase().split(" ");

        abbr = splitSentence2[0].substring(0, 1) + splitSentence2[1].substring(0, 1) + splitSentence2[2].substring(0, 1);


        System.out.println("Abbreviation for '" + threeWordSentence_2 + "' is : " + abbr);
        // Abbreviation for 'very gOOD MorNING' is : VGM

        
        // Question - 3:
        /**
         * print the number of words in the sentence.
         */
        String sentence_3 = "We all are here to learn programming and testing";

        String[] numWords = sentence_3.split(" ");
        int lengthOfWords = numWords.length;

        System.out.println("The length of the sentence 3 is : " + lengthOfWords);

    }

}
