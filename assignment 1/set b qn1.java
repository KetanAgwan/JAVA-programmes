//Write a java program to accept n city names and display them in ascending order.
import java.util.*;
class Cities{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arr[] = new String[5];
        System.out.println("Enter city names..");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLine();
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }

    }
}