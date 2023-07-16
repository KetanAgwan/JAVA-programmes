//Define a class Student(rollno,name,per). Create n objects of the student class and Display
//        it using toString().(Use parameterized constructor)


import java.util.*;
class Student1{
    int rno;
    String name;
    float per;
    static Scanner sc = new Scanner(System.in);
     Student1(int rno,String name,float per){
         this.rno = rno;
         this.name = name;
         this.per = per;
    }

//    void get{
//        System.out.println("the roll no :"+rno);
//        System.out.println("the name :"+rno);
//        System.out.println("the percentage :"+rno);
//    }


    @Override
    public java.lang.String toString() {
        return rno+" "+name+" "+per;
    }

    public static void main(String[] args) {
        Student1 s[] = new Student1[5];
        System.out.println("enter the number of students :");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("enter rno");
            int rno = sc.nextInt();
            System.out.println("enter name");
            String name = sc.next();
            System.out.println("enter percentage");
            float per = sc.nextFloat();
            s[i] = new Student1(rno,name,per);
        }

        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}