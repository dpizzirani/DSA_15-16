package lab2;

/**
 * 1. Recursion
 A palindrome is a phrase that reads the same forward and backward (examples: ‘racecar’, ‘radar’, ‘noon’, or
 ‘rats live on no evil star’). By extension we call every string a palindrome that reads the same from left to
 right and from right to left.
 Develop a recursive algorithm that takes as input a string and decides whether the string is a palindrome.
 1. Write down your algorithm in pseudocode.
 2. Implement your algorithm in the PalindromeChecker class.
 */

public class PalindromeChecker {

    public boolean palindromeChecker(String test) {
        return palindromeChecker(test, 0, test.length()-1);
    }

    //DISPARI:  abiba
    //PARI:     noon
    public boolean palindromeChecker(String test, int l, int r) {
        if (l > r)
            return true;

        if (test.charAt(l) == test.charAt(r))
            return palindromeChecker(test, l+1, r-1);
        else
            return false;
    }

    public static void main(String[] args) {

        PalindromeChecker p = new PalindromeChecker();

        System.out.println("noon: " + p.palindromeChecker("noon"));
        System.out.println("racecar: " + p.palindromeChecker("racecar"));
        System.out.println("rats live on no evil star: " + p.palindromeChecker("rats live on no evil star"));

        System.out.println("noons: " + p.palindromeChecker("noons"));
        System.out.println("race-car: " + p.palindromeChecker("race-car"));
        System.out.println("rats live, on no evil star: " + p.palindromeChecker("rats live, on no evil star"));


    }

}
