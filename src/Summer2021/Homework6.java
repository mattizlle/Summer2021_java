package Summer2021;

import java.util.Locale;

public class Homework6 {

    public static void main(String[] args) {

        //Question 1

        /**
         * String sentence = "happy new year TO You DeaR"
         * // code
         * String threeWordSentence = "Happy New Year To You Dear"
         *
         */

        String threeWordSentence = "hApPy nEW yeAr";
        String result = "";

        System.out.println("Before code : " + threeWordSentence);

        String[] threeWordSentenceArray = threeWordSentence.split(" ");

        for (int i = 0; i < threeWordSentenceArray.length; i++) {
            result += threeWordSentenceArray[i].substring(0, 1).toUpperCase() +  threeWordSentenceArray[i].substring(1).toLowerCase();

            if (i != threeWordSentenceArray.length-1) {
                result += " ";
            }

            System.out.println("After code : " + result);

        }

        //Question 2

        /**
         * create the abbreviation  // HNY
         */
        String threeWordSentence_2 = "very gOOD MorNING to You dear";
        String abbr = "";

        // code


        threeWordSentence_2 = threeWordSentence_2.toLowerCase();

        String[] threeWordSentence_2Array = threeWordSentence_2.toUpperCase().split(" ");

        for (int i = 0; i < threeWordSentence_2Array.length-1; i++) {
            abbr += threeWordSentence_2Array[i].charAt(0);

            System.out.println("\nAbbreviation for '" + threeWordSentence_2 + "' is : " + abbr);
            // Abbreviation for 'very gOOD MorNING to You dear' is : VGMTYD
        }

        // Question 3
        /**
         * Create variable to store studentScore and maxScore;
         * Based on the percentage, display grade to student:
         * Grade A: 91-100
         * Grade B: 81-90.99
         * Grade C: 71-80.99
         * Grade D: 61-70.99
         * Grade E: 51-60.99
         * Grade F: less than or equal to 50.99
         *
         * student got grade A, gets full scholarship for next year
         *
         * student got better than grade D (i.e. B or C), get half scholarship for next year
         *
         * otherwise no scholarship for next year
         *
         *
         * Sample output:
         *  Your percentage: XX.yy and your Grade is: Z
         *  Based on your grade(Z), you get XXXX scholarship for next year
         *
         */

        double studentScore = 119.5;
        int maxScore = 150;

        double percentage = studentScore*100.0/maxScore;
        percentage = Math.round(percentage*100)/100.0; //setting to 2 digit decimal

        if (studentScore<0 && percentage > 100) {
            System.out.println("\nInvalid Score " + studentScore + ". Score cannot be greater than max score " + maxScore);
        } else if(percentage >=91 ) {
            System.out.println("\nYour percentage  is = "+percentage + " and your Grade is A");

            System.out.println("\nBased on your Grade( A ), you get full scholarship for next year");
        } else if(percentage >=81 ) {
            System.out.println("\nYour percentage is = "+percentage + " and your Grade is B");

            System.out.println("\nBased on your Grade( B ), you get half scholarship for next year");
        } else if(percentage >=71) {
            System.out.println("\nYour percentage is = "+percentage + " and your Grade is C");

            System.out.println("Based on your Grade( C ), you get half scholarship for next year");
        } else if(percentage >=61) {
            System.out.println("Your percentage is = "+percentage + " and your Grade is D");

            System.out.println("\nBased on your Grade( D ), you get no scholarship for next year");
        } else if(percentage >=51) {
            System.out.println("\nYour percentage  is = "+percentage + " and your Grade is E");

            System.out.println("\nBased on your Grade( E ), you get no scholarship for next year");
        } else {
            System.out.println("\nYour percentage is " + percentage + " and your grade is F");

            System.out.println("\nBased on your Grade( F ), you get no scholarship for next year");
        }

        //Question 4

        /**
         * Create an array and store 5 int-values.
         * Print the average of numbers in array.
         *
         * sum of values / number of values
         *
         * {10, 20, 30, 40, 50}
         * (10+20+30+40+50)/5
         *
         */

        int[] numbers = {10, 15, 20, 22, 40};
        int sum = 0;

        if (numbers.length > 0) {
            for(int i=0; i<numbers.length; i++) {
                sum = sum + numbers[i];
            }
            sum = sum/numbers.length;
            System.out.println("\nThe sum of values is " + sum);
          }

        //Question 5

        /**
         *
         * String[] names = {"john", "happy", "peACe", "jOy", "lui", "harry"}
         * String nameToSearch = "faith";
         *
         * if name found, Print "LUI is at position-5 in the array"
         * if name not found, print "king is not present in the array"
         *
         */

        String[] names = {"john", "happy", "peACe", "jOy", "lui", "harry"};

        String nameToSearch = "Lina";

        boolean isFound = false;

        for(int i=0; i<names.length; i++) {
            if(names[i].equalsIgnoreCase(nameToSearch)) {
                isFound = true;
                System.out.println("\n" + names[i] + " is at position " + (i+1) + " in the array");
            }
        }
        if(!isFound) {
            System.out.println("\n" + nameToSearch + " is not present in the array");
        }

        //Question 6

        /**
         *
         * String[] names = {"john", "happy", "peACe", "jOy", "LEarN", "Orange", "king kong", "iRON MAN"};
         * print the names from array if the name-length is >=5 and name contains 'o' or 'O'
         *
         */

        String[] myNames = {"john", "happy", "peACe", "jOy", "LEarN", "Orange", "king kong", "iRON MAN"};
        String result1 = "";
        for(int i=0; i<myNames.length; i++) {
            if (myNames[i].length() >= 5 && myNames[i].toLowerCase().contains("o")) {
                result1 = result1 + ", " + myNames[i];
            }
        }

        System.out.println("\nThe names that the length is >=5 and that contains 'o' or 'O' are : " + result1 );

        //Question 7

        /**
         * int[] numbers = {11, 22, 33, 44, 55, 98, 65};
         * String[] names = {"john", "happy", "peACe", "jOy", "LEarN", "joy", "laugh"};
         *
         * Limitation: both array must be of same length
         *
         * if the numbers-array has 33 in it,
         *      print the index at which 33 is present in numbers array
         *      And, print the name present at same index in names array.
         *
         */

        int[] num = {11, 22, 33, 44, 55, 98, 65};

        String[] names1 = {"john", "happy", "peACe", "jOy", "LEarN", "joy", "laugh"};

        int numPresent = 65;


        for (int i=0;i<num.length;i++) {

            if (num[i] == numPresent) {

                System.out.println("\n" + numPresent+ " is at index " + i);

                System.out.println("The name " + names1[i] + " is present at the same index ");
                
                break;
            }

        }




    }

    }

