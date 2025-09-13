package Recursion;

import java.util.Scanner;

class Solution2 {
    static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int result = Solution2.fibonacci(n);

        System.out.println("Fibonacci number at position " + n + " is: " + result);
    }
}
