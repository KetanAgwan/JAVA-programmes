//Write a Java program to calculate power of a number using recursion.

import java.util.*;
import java.lang.*;
class PowerX{
    static int a,sum,n;
    static void power(){
        if (a>1){
            sum*=n;
            a--;
            power();
        }
        else{
            System.out.println("Answer="+sum);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        n = sc.nextInt();
        System.out.println("Enter power");
        a = sc.nextInt();
        sum = n;
        power();
    }
}