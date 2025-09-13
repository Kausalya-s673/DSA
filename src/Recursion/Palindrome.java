package Recursion;
import java.util.Scanner;

class Solution5 {
    static boolean isPalindrome(String str, int start, int end) {
        if (start >= end) return true;  // base case
        if (str.charAt(start) != str.charAt(end)) return false; // mismatch
        return isPalindrome(str, start + 1, end - 1); // recursive check
    }
}

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        boolean result = Solution5.isPalindrome(input, 0, input.length() - 1);

        if (result)
            System.out.println(input + " is a palindrome.");
        else
            System.out.println(input + " is not a palindrome.");
    }
}
