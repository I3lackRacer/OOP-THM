package main.VW6.ThousandDots;

public class ThousandDots
{

    /*
    1.1)
    Iterates the number backwards and places with the help of a counter variable
    every 3 digits a dot.
     */
    public static String toStringWithDots(int number) {
        char[] numberArray = String.valueOf(number).toCharArray();
        String result = "";
        int counter = 0;
        for (int i = numberArray.length - 1; i >= 0; i--) {
            if (counter != 0 && counter % 3 == 0) {
                result = '.' + result;
            }

            result = numberArray[i] + result;
            counter++;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(toStringWithDots(1233456456));
    }
}
