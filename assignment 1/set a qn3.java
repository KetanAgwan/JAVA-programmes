//Write a java Program to accept employee name from a user and display it in reverse order.
import java.util.*;
class Employee{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name ");
        String s = sc.nextLine();
        StringBuffer s1 = new StringBuffer(s);
        System.out.println(s1.reverse());
    }
}