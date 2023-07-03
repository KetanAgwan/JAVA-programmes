//Write a java program to search given name into the array, if it is found then display its index otherwise display appropriate message.
import java.util.*;

class Find{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arr[] = {"php","java","python","jquery","javascript"};
        System.out.println("Enter strig to find :");
        String s = sc.nextLine();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(s)) {
                System.out.println("String found at index no. = "+i);
                return;
            }
        }
        System.out.println("String is not found in the array");
    }
}