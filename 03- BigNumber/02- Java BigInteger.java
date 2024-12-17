/*
In this problem, you have to add and multiply huge numbers! These numbers are so big that you can't contain them in any ordinary data types like a long integer.
Use the power of Java's BigInteger class and solve this problem.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
         Scanner sc = new Scanner(System.in);
         String num1=sc.nextLine();
         String num2=sc.nextLine();
         
         BigInteger a=new BigInteger(num1);
         BigInteger b=new BigInteger(num2);
         
         BigInteger sum=a.add(b);
         BigInteger product=a.multiply(b);
             
        System.out.println(sum);
        System.out.println(product);
         
    }
}
