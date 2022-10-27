package Java;

public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(isPalindrome(10101));
    }

    /*
     * Given an integer x, return true if x is palindrome integer.
     * 
     * An integer is a palindrome when it reads the same backward as forward.
     * 
     * For example, 121 is a palindrome while 123 is not.
     */

    public static boolean isPalindrome(int x) {
        String xs = Integer.toString(x);
        String compareString = "";
        for (int i = xs.length(); i > 0; i--) {
            compareString += xs.charAt(i - 1);
        }
        if (xs.equals(compareString))
            return true;

        return false;
    }
}
