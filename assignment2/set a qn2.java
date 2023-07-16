//Write a Java program to display Fibonacci series using function.

class MD{
   static void fibo(){
        int t1=0,t2=1,t3;
        System.out.println(t1);
        System.out.println(t2);
        for (int i = 0; i < 10; i++) {
            t3 = t1 + t2;
            t1 = t2;
            t2 = t3;
            System.out.println(t3);
        }
    }
    public static void main(String[] args) {
        fibo();
    }
}