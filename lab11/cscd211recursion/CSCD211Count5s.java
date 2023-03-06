package lab11.cscd211recursion;

/**
 * The class for the single recursive method used for this lab
 */
public class CSCD211Count5s
{
    /**
     * Given a non-negative int n, return the count of the occurrences of 5 as a digit,
     * so for example 515 yields 2. (no loops or strings).
     * Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6),
     * while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
     *
     * count5s(515) - 2
     * count5s(5) - 1
     * count5s(123) - 0
     * count5s(57) - 1
     * count5s(75) - 1
     *
     * <br>
     * @param n The value to be checked for 5s
     * @return int The number of 5s in the number n
     */
    public static int count5s(final int n)
    {
        if (n == 0) {
            return 0;
        }
        int rightmostDigit = n % 10;
        if (rightmostDigit == 5) {
            return 1 + count5s(n / 10);
        }
        return count5s(n / 10);
    }// end method

}// end class