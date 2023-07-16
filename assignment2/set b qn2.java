//Define a class product(pid,pname,price). Write a function to accept the product details, to
//        display product details and to calculate total amount. (use array of Objects)

import java.util.*;
class Product{
    int pid,price;
    String pname;
    static Scanner sc = new Scanner(System.in);
    static int total;
    void accept(){
        System.out.println("Enter pid");
        pid = sc.nextInt();
        System.out.println("enter pname ");
        pname = sc.next();
        System.out.println("enter price ");;
        price = sc.nextInt();
    }
    static void calc(Product arr[],int n){
        for (int i = 0; i < n; i++) {
           total += arr[i].price;
        }
        System.out.println("Total amount = "+total);
    }

    public static void main(String[] args) {
        Product parr[] = new Product[5];
        System.out.println("Enter limit");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            parr[i] = new Product();
            parr[i].accept();
        }
        calc(parr,n);
    }
}

