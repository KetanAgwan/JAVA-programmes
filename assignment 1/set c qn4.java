//Write a java program to display transpose of given matrix.
import java.util.*;
class Matrix1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[5][5];
        System.out.println("Eter rows :");
        int rows = sc.nextInt();
        System.out.println("Eter columns :");
        int columns = sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Transpose = ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(a[j][i]);
            }
            System.out.println();
        }
    }
}