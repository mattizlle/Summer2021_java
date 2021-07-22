package Summer2021;

public class Homework5<num2> {

    public static void main(String[] args) {

        // Question 1

        /**
         * Create variable to store studentScore and maxScore;
         * Based on the percentage, display grade to student:
         * Grade A: 91-100
         * Grade B: 81-90.99
         * Grade C: 71-80.99
         * Grade D: 61-70.99
         * Grade E: 51-60.99
         * Grade F: less than or equal to 50.99
         */
        int studentScore = 90;
        int maxScore = 160;
        // calculate percentage --> 80*100/150
        // print result like:
        // Your percentage: XX.yy and your Grade is: Z

        float percentage = studentScore * 100.0f / maxScore;

        if (percentage >= 91) {
            System.out.println("Your percentage is: " + percentage + " and your Grade is: A");
        } else if (percentage >= 81) {
            System.out.println("Your percentage is: " + percentage + " and your Grade is: B");
        } else if (percentage >= 71) {
            System.out.println("Your percentage is: " + percentage + " and your Grade is: C");
        } else if (percentage >= 61) {
            System.out.println("Your percentage is: " + percentage + " and your Grade is: D");
        } else if (percentage >= 51) {
            System.out.println("Your percentage is: " + percentage + " and your Grade is: F");
        } else if (percentage <= 50.99) {
            System.out.println("Your percentage is: " + percentage + " and your Grade is: E");
        }



    // Question 2
    /**
     * store value in an int variable
     * if number is divisible by 3, print "divisible by 3"
     * if number is divisible by 5, print "divisible by 5"
     * if number is divisible by 3 and 5, print "divisible by both"
     * if not divisible by 3 or 5, print the number
     */
    int num2 = 10;

    if (num2%3 == 0 && num2%5 == 0){
        System.out.println(num2 + " is divisible by both");
    }else if (num2%5 == 0) {
        System.out.println(num2 + " is divisible by 5");
    }else if (num2%3 == 0) {
        System.out.println(num2 + " is divisible by 3");
    }else {
        System.out.println(num2);

    }
  }

}
