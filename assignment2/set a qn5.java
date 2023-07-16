//Write a Java program to calculate factorial of a number using recursion.

import java.util.*;
class Fact{
    static int sum =1;
    static void fact(int n){
        if (n >= 1) {
            sum *= n;
            n--;
            fact(n);
        }
        else
         System.out.println("Factorial = "+sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter limit :");
        int n = sc.nextInt();
        fact(n);
    }
}