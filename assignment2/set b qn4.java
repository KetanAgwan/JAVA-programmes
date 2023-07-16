//Define a class MyNumber having one private integer data member. Write a default
//constructor to initialize it to 0 and another constructor to initialize it to a value. Write
//        methods isNegative, isPositive. Use command line argument to pass a value to the object
//        and perform the above tests.

class MyNumber{
    private int a;
    MyNumber(){
        a = 0;
    }
    MyNumber(int a){
        this.a = a;
    }

    void isNegative(){
        if (a<0)
            System.out.println("the number is negative");
        else
            System.out.println("number is not negative");
    }
    void isPositive(){
        if (a>0)
            System.out.println("the number is positive");
        else
            System.out.println("number is not negative");
    }

    public static void main(String[] args) {
        MyNumber n1 = new MyNumber(3);
        MyNumber n2 = new MyNumber();
        n1.isNegative();
        n1.isPositive();
        n2.isNegative();;
        n2.isPositive();
    }
}