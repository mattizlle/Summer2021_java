package Summer2021;

public class Homework2 {

    public static void main(String[] args) {

        /**
         *
         * 1. Convert Celsius to Fahrenheit
         *
         * T(°F) = T(°C) × 9/5 + 32
         */

        double cTemp = 18;
        double fTemp = cTemp * 9/5 + 32;

        System.out.println(cTemp + "°C =" + fTemp + "°F");

        /**
         *
         * 2. Convert Celsius to Kelvin
         *
         * T(K) = T(°C) + 273.15
         */

        double cTemp1 = 42;
        double kTemp = cTemp1 + 273.15;

        System.out.println(cTemp1 + "°C =" + kTemp + "K");

        /**
         *
         * 3. Convert Fahrenheit to Celsius
         *
         * T(°C) = (T(°F) - 32) × 5/9
         */

        double fTemp1 = 73.0;
        double cTemp2 = (fTemp1 - 32) / 1.8;

        System.out.println(fTemp1 + "°F =" + cTemp2 + "°C");

        /**
         *
         * 4. Convert Fahrenheit to Kelvin
         *
         * T(K) = (T(°F) + 459.67) × 5/9
         */

        double ftemp2 = 65;
        double ktemp1 = (ftemp2 + 459.67) * 5/9;

        System.out.println(ftemp2 + "°F =" + ktemp1 + "K");

        /**
         *
         * 5. Convert Kelvin to Celsius
         *
         * T(°C) = T(K) - 273.15
         */

        double ktemp2 = 152;
        double ctemp3 = ktemp2 - 273.15;

        System.out.println(ktemp2 + "K =" + ctemp3 + "°C");

        /**
         *
         * 6. Convert Kelvin to Fahrenheit
         *
         * T(°F) = T(K) × 9/5 - 459.67
         */

        double kTemp3 = 231;
        double fTemp3 = kTemp3 * 9/5 - 459.67;

        System.out.println(kTemp3 + "K ="+ fTemp3 + "°F");


    }
}
