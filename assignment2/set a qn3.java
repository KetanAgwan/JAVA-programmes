//Write a Java program to calculate area of Circle, Triangle & Rectangle.(Use Method Overloading)
import java.util.*;
class Area{
    final float PI = 3.14f;
    void area(int r){
        System.out.println("The area of circle is :"+PI *(r*r));
    }

    void area(float base,float height){
        System.out.println("Area of triangle is:"+((float)1/2*(base*height)));
    }

    void area(int l,int b){
        System.out.println("Area of rectangle is :"+l*b);
    }

    public static void main(String[] args) {
        Area ob = new Area();
        ob.area(5);
        ob.area(5.00f,4.00f);
        ob.area(5,6);
    }
}