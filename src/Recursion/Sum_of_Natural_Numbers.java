package Recursion;

import java.util.Scanner;

class Solution1 {
    static int sumNatural(int n) {
        if (n == 0) return 0;
        return n + sumNatural(n - 1);
    }
}

public class Sum_of_Natural_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int result = Solution1.sumNatural(n);

        System.out.println("Sum of natural numbers from 1 to " + n + " is: " + result);
    }
}
