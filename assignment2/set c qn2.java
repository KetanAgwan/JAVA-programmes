//Write a java program to accept n employee names from user. Sort them in ascending
//        order and Display them.(Use array of object nd Static keyword)
import java.util.*;
class Sort{
    public static void sortFun(String []arr){
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of employees");
        int n = sc.nextInt();
        String arr[] = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("enter name "+i);
            arr[i] = sc.next();
        }
        sortFun(arr);
    }

}