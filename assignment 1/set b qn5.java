//Write a java program to display following pattern: 1
//        1
//        0 1
//        0 1 0
//        1 0 1 0
import java.util.*;
class Pattern3{
    public static void main(String[] args) {
        int n = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                if (n == 1) {
                    System.out.print(n);
                    n--;
                }
                else {
                    System.out.print(n);
                    n++;
                }
            }
            System.out.println();
        }
    }
}