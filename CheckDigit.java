/*************************************************************************
 *  Compilation:  javac CheckDigit.java
 *  Execution:    java CheckDigit 020131452
 *
 *
 *  Takes a 12 or 13 digit integer as a command line argument, then computes
 *  and displays the check digit
 *
 *  java CheckDigit 048231312622
 *  0
 *
 *  java CheckDigit 9780470458310
 *  0
 * 
 *  java CheckDigit 9780470454310
 *  8
 * 
 *  Print only the check digit character, nothing else.
 *
 *************************************************************************/

public class CheckDigit {

    public static void main (String[] args) {


        long number = Long.parseLong(args[0]);
        int oddPlacesSum = 0;
        int evenPlacesSum =0;
        boolean flag = true;
        while (number > 0) {
            if (flag) {
                oddPlacesSum += number%10;
                number /=10;
            }

            else {
                evenPlacesSum += number%10;
                number /= 10; }
            
            flag = !flag;

        }
        int oddDigit = oddPlacesSum % 10;
        int evenDigit = evenPlacesSum % 10;
        evenDigit = (evenDigit * 3) % 10;
        int result = (oddDigit + evenDigit) % 10;
        System.out.println(result);
    }
}