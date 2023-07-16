//Define a class person(pid,pname,age,gender). Define Default and parameterised
//        constructor. Overload the constructor. Accept the 5 person details and display it.(use this
//        keyword)

import java.util.*;
class Person{
    int pid,age;
    String pname,gender;
    static Scanner sc = new Scanner(System.in);
    Person(){
        System.out.println("enter pid");
        pid = sc.nextInt();
        System.out.println("enter pname");
        pname = sc.next();
        System.out.println("enter age");
        age = sc.nextInt();
        System.out.println("enter gender ");
        gender = sc.next();
    }

    Person(int pid,String pname,int age,String gender){
        this.pid = pid;
        this.pname = pname;
        this.age = age;
        this.gender = gender;
    }

    void display(){
        System.out.println("the pid = "+pid);
        System.out.println("pname = "+pname);
        System.out.println("age  = "+age);
        System.out.println("gender  = "+gender);
    }

    public static void main(String[] args) {
        Person p1,p2,p3,p4,p5;
        p1 = new Person(1,"rahul",23,"male");
        p2 = new Person(2,"ganesh",25,"male");
        p3 = new Person(3,"gangubai",21,"female");
        p4 = new Person();
        p5 = new Person();
        p1.display();
        p2.display();
        p3.display();
        p4.display();
        p5.display();
    }
}