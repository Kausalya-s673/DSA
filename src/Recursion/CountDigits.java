package Recursion;

import java.util.Scanner;

class Solution7 {
    static int countDigits(int n) {
        if (n == 0) return 0;
        return 1 + countDigits(n / 10);
    }
}

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

   
        if (n == 0) {
            System.out.println("Number of digits in 0 is: 1");
        } else {
            int result = Solution7.countDigits(Math.abs(n));
            System.out.println("Number of digits in " + n + " is: " + result);
        }
    }
}

