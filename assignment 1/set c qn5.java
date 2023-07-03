//Write a java program to display alternate character from a given string.

import java.util.*;
class Alternate{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string :");
        String s1 = sc.nextLine();
        for (int i = 0; i < s1.length(); i+=2) {
            System.out.print(s1.charAt(i));
        }
    }
}