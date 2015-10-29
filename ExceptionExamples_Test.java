import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        try{
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(x/y);
        }
        catch(InputMismatchException e1){
            System.out.println(e1.getClass().getName());
        }
        catch(ArithmeticException e1){
            System.out.println(e1.getClass().getName()+": / by zero");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
