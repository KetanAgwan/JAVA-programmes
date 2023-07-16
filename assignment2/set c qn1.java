//Define class Student(rno, name, mark1, mark2). Define Result class(total, percentage)
//        inside the student class. Accept the student details & display the mark sheet with rno,
//        name, mark1, mark2, total, percentage. (Use inner class concept)


import java.util.Scanner;

class Student2{
        int rno;
        String name;
        float m1,m2;


        class Result{
            float total;
            float per;
            void set(){
                Scanner sc = new Scanner(System.in);
                System.out.println("enter roll no");
                rno = sc.nextInt();
                System.out.println("enter name");
                name = sc.next();
                System.out.println("enter markk 1");
                m1 = sc.nextFloat();
                System.out.println("enter mark 2");
                m2 = sc.nextFloat();
                 total = m1+m2;
                 per = total/2;
            }
            void show(){
                System.out.println("rno = "+rno);
                System.out.println("name = "+name);
                System.out.println("mark 1 = "+m1);
                System.out.println("mark 2 = "+m2);
                System.out.println("total ="+total);
                System.out.println("percentage = "+per);
            }
        }

        public static void main(String[] args) {
            Student2 s1 = new Student2();
            Result sr = s1.new Result();
            sr.set();
            sr.show();
        }
    }
