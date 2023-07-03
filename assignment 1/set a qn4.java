//Write a java program to display all the even numbers from an array. (Use Command Line arguments)

import java.util.*;

class Even{
    public static void main(String[] args) {
        int a[] = {10,20,30,33,24,55,37,29};
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.println(a[i]);
            }
        }
    }
}