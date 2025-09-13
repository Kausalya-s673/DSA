package Recursion;

import java.util.Scanner;

class Solution{
    static int fact(int n){
        if(n==0||n==1)
            return 1;
        return n*fact(n-1);
    }
}
public class Factorial_of_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n=sc.nextInt();
        int res= Solution.fact(n);
        System.out.println(res);
    }
}
