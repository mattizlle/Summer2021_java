package Summer2021;

import java.util.Locale;

public class Homework3 {

    public static void main(String[] args) {

        // Question - 1
        String sentence_1 = "hello dear, how are you?";
        int result_1 = 0;
        result_1 = sentence_1.length()>10 ? 100 : 15;

        /**
         * Assign result_1 as 100 if the length of sentence_1 is 10 or greater
         * else assign result_1 as 15
         *
         * use: Ternary operator
         *
         */
        System.out.println("result_1 = " + result_1);

        // Question - 2
        String sentence_2 = "We all ARe GOod ProgrAMmer";
        sentence_2 = sentence_2.replace('R' , 'F').replace('r' , 'F');
        /**
         * replace all 'R/r' with 'F'
         */
        System.out.println(sentence_2);     // "We all AFe GOod PFogFAMmeF";

        // Question - 3
        String sentence_3 = "ABC Networks";
        String result_3 = "";
        /**
         * 1. Display/Print length of your sentence_3
         * 2. does sentence_3 starts with "a" (ignore cases)
         * 3. does sentence_3 ends with "K" (ignore cases)
         * 4. Assign result_3 as "Media" if sentence_3 starts with 'a' (ignore cases)
         *      else assign "Entertainment"
         *      Print the result_3 in console.
         */
        int lengthOfString = sentence_3.length();
        System.out.println(lengthOfString);

        boolean sentence3StartWith_a = sentence_3.toLowerCase().startsWith("a");
        System.out.println(sentence3StartWith_a);

        boolean sentence3EndsWith_K = sentence_3.toLowerCase().endsWith("K");
        System.out.println(sentence3EndsWith_K);

        result_3 = sentence_3.toLowerCase().startsWith("a") ? "Media" : "Entertainment";
        System.out.println(result_3);




    }
}
