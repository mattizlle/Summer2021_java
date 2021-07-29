package Summer2021;

public class Homework7 {

    public static void main(String[] args) {

        /**
         * Task 1:
         * Find out if the value stored in word variable is palindrome.
         * And, store the result in "isPalindrome" variable
         * --> palindrome: string which reads the same in reverse
         * eg:
         * level --> level          (palindrome)
         * eye  --> eye             (palindrome)
         * head --> daeh            (not palindrome)
         * racecar --> racecar      (palindrome)
         */

        String task1Word = "level";

        String isItPal = "";

        int length = task1Word.length();

        for (int i=length-1; i>=0; i--) {

            isItPal += task1Word.charAt(i);

        }

        if (isItPal.equals(task1Word)) {

            System.out.println("The word " + isItPal + " is a palindrome");
        } else {

            System.out.println("The word " + isItPal + " is not a palindrome");
        }

        /**
         * Task2:
         * Find if the value stored in num variable is a prime number or not.
         * And, store the final result in "isPrime" variable
         * --> prime number -> number which is ONLY divisible by 1 and itself.
         * eg:
         * 5 -> prime
         * 7 -> prime
         * 10 -> not a prime
         */
        int num = 10;

        boolean isPrime = true;

        if(num < 1) {

            for (int i=2; i<num; i++) {

                if (num%i == 0) {

                    isPrime = false;

                    break;
                }
            }

            System.out.println("Is number  " + num + " a prime number? " + "The result is " + isPrime);

        } else {

            System.out.println("\nThe number " + num + " is not a prime number");

        }

        /**
         * Task3:
         * Write code to reverse a string
         *
         * "happy holidays"
         *
         * "syadiloh yppah"
         *
         */
        String task3String = "Happy Holidays";

        int length1 = task3String.length();

        String revSentence = "";

        for (int i=length1-1; i>=0; i--) {
            revSentence += task3String.charAt(i);
        }
        System.out.println("\nThe word " + task3String + " in reverse is "  + revSentence);

        /**
         * Task4:
         * Count the number of the vowels (a,e,i,o,u) present in the given sentence.
         */
        // String task4Sentence = "hOW arE You My DEAr FRiEnd";    // 9

        String word = "hOW arE You My DEAr FRiEnd";

        int count = 0;

        for(int i=0; i<word.length(); i++) {

            char vowels = word.toLowerCase().charAt(i);

            if (vowels == 'a' || vowels == 'e' || vowels == 'i' || vowels == 'o' || vowels == 'u') {

                count++;
            }
        }
        System.out.println("\nThe word " + word + " has " + count + " vowels");


    }
}
