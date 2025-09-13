package Recursion;


import java.util.Scanner;

class Solution3 {
    static String reverseString(String str) {
        if (str.isEmpty()) return str;
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}

public class Reverse_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String result = Solution3.reverseString(input);

        System.out.println("Reversed string: " + result);
    }
}
