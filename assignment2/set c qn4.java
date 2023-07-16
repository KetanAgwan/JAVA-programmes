//Write a java program to accept details of ‘n’ books. And Display the quantity of given
//        book.

import java.util.Scanner;

class Book{
    String name;
    int price,qnt;
    static Scanner sc = new Scanner(System.in);
    void set(){
        System.out.println("Enter name");
        name = sc.next();
        System.out.println("enter price");
        price = sc.nextInt();
        System.out.println("enter quantity");
        qnt = sc.nextInt();
    }

    void get(){
        System.out.println("Name "+name);
        System.out.println("Price "+price);
        System.out.println("Available quantity "+qnt);
    }

    static void find(Book arr[],String nme){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].name.equals(nme)) {
                arr[i].get();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the number of book");
        int n = sc.nextInt();
        Book b[] = new Book[n];
        for (int i = 0; i < n; i++) {
            b[i] = new Book();
            b[i].set();
        }
        System.out.println("Enter the name to search ");
        String nme = sc.next();
        find(b,nme);
    }
}