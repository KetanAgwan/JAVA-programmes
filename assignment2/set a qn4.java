//Write a Java program to Copy data of one object to another Object.
import java.util.*;
class Copy{
    int a;
    String b;
    Scanner sc = new Scanner(System.in);
    void accept(){
        System.out.println("enter no");
        a = sc.nextInt();
        System.out.println("enter name");
        b = sc.next();
    }
    void disp(){
        System.out.println("no :"+a);
        System.out.println("name :"+b);
    }

    public static void main(String[] args) {
        Copy ob1 = new Copy();
        ob1.accept();
        Copy ob2 = ob1;
        System.out.println("Ob 1:");
        ob1.disp();
        System.out.println("ob 2:");
        ob2.disp();
    }
}