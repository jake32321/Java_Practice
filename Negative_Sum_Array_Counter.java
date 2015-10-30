import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
  This code cheacks for the number of subarrays where the sum of those 
  subarray elements are negative.  For each where the sum is negative
  the count of the negative sum sub arrays and returns it at the end 
  of execution.
*/

public class Solution {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] array = new int[n];
    int count = 0;
    for(int i=0; i<n; i++){
        if(sc.hasNextInt()){
            array[i] = sc.nextInt();
       }
        int sum = 0;
        for(int j=i; j<n; j++){
            if(sc.hasNextInt()){
                array[j+1] = sc.nextInt();
            }
            sum += array[j];
            if(sum<0){
                count++;
            }
        }
    }
        System.out.println(count);
  }
}
