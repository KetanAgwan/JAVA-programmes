//Write a java program to accept n numbers from a user store only Armstrong numbers in an array
import java.util.*;
class Armstrong{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        int j = 0;
        System.out.println("Enter limit ");
        int n = sc.nextInt();
        System.out.println("Enter Numbers ");
        for (int i = 1; i <= n; i++) {
            int num = sc.nextInt();
            int temp = num;
            int sum = 0;
            while(temp > 0){
                int digit = temp % 10;
                sum += digit*digit*digit;
                temp /= 10;
            }
            if (sum == num){
                arr[j] = num;
                j++;
            }
        }
        for (int i = 0; i < j; i++) {
            System.out.println(arr[i]+" ");
        }
    }
}