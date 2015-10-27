import java.io.*;
import java.util.*;

public class Solution {

   static boolean isAnagram(String A, String B) {
      boolean returnVal = false;
      if(A != null && B != null){
        char [] arrayA = A.toLowerCase().toCharArray();  //moves lowercase chars to an array
        char [] arrayB = B.toLowerCase().toCharArray();
        Arrays.sort(arrayA);  //sorts the char arrays
        Arrays.sort(arrayB);   
        returnVal = Arrays.equals(arrayA, arrayB); //compares the char arrays
      }
      return returnVal;
   }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next(); //scans for inputs 
        String B=sc.next();
        boolean ret=isAnagram(A,B); //calls method
        if(ret)System.out.println("Anagrams");
        else System.out.println("Not Anagrams");
    
    }
}
