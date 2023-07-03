//Write a java Program to display all the perfect numbers between 1 to n.
import java.util.*;

class Perfect{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit ");
        int n = sc.nextInt();

        for (int i = 3; i <= n; i++) {
            int sum = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum = sum + j;
                }
            }
            if (sum == i)
                System.out.println(i);
        }
    }
}