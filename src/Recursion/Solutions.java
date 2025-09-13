package Recursion;
import java.util.Scanner;

class Solution8 {
    static int sumDigits(int n) {
        if (n == 0) return 0;
        return (n % 10) + sumDigits(n / 10);
    }
}

public class Solutions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int result = Solution8.sumDigits(n);

        System.out.println("Sum of digits of " + n + " is: " + result);
    }
}
