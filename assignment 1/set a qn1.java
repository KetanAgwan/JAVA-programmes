//Write a java Program to check whether given number is Prime or Not.
import java.util.*;

class Prime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println("the number is not prime...");
                return;
            }
        }
        System.out.println("the number is prime");
    }
}