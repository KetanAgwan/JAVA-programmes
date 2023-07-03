//Write a java program to display each word in reverse order from a string array.
import java.util.*;
class Reverse1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String s1 = sc.nextLine();
        String arr[] = s1.split(" ");
        for (int i = 0; i < arr.length; i++) {
            StringBuffer s2 = new StringBuffer(arr[i]);
            System.out.print(s2.reverse()+" ");
        }
    }
}