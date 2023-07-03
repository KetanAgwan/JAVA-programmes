//Q. Write a java program to count the frequency of each character in a given string.
import java.util.*;
 class Find1{
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter string :");
   String s1 = sc.next();
   int insertionIndex = 0;
   char charArr[] = new char[50];
   int FrcyArr[] = new int[50];
   for (int i = 0; i < s1.length(); i++) {
    int breakFlag = 0;
    for (int k = 0; k < charArr.length; k++) {
     if (charArr[k] == s1.charAt(i)) {
      breakFlag = 1;
     }
    }
    if (breakFlag == 0) {
     charArr[insertionIndex] = s1.charAt(i);
     for (int j = 0; j < s1.length(); j++) {
      if (s1.charAt(j) == charArr[insertionIndex]){
       FrcyArr[insertionIndex] += 1;
      }
     }
     insertionIndex++;
    }
   }
   for (int i = 0; i < charArr.length; i++) {
    if (charArr[i] == 0) continue;
    System.out.println(charArr[i]+" = "+FrcyArr[i]);
   }
  }
 }