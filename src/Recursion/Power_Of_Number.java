package Recursion;

import java.util.Scanner;

class Solution4 {
    static int power(int base, int exp) {
        if (exp == 0) return 1;
        return base * power(base, exp - 1);
    }
}

public class Power_Of_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base: ");
        int base = sc.nextInt();

        System.out.print("Enter exponent: ");
        int exp = sc.nextInt();

        int result = Solution4.power(base, exp);

        System.out.println(base + "^" + exp + " = " + result);
    }
}
