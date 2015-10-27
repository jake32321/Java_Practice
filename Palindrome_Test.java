import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        StringBuffer sb = new StringBuffer(A);
        sb = sb.reverse();
        if(A.equals(sb.toString())){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}

