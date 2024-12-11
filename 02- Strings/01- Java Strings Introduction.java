/*
Input Format

The first line contains a string A. The second line contains another string B. The strings are comprised of only lowercase English letters.

Output Format

There are three lines of output:
For the first line, sum the lengths of A and B.
For the second line, write Yes if A is lexicographically greater than B otherwise print No instead.
For the third line, capitalize the first letter in both A and B and print them on a single line, separated by a space.
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        //First Query
        int len= A.length()+B.length();
        System.out.println(len);
        //Second Query
        if(A.compareTo(B)>0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        //Third Query
        String capitalA=A.substring(0,1).toUpperCase()+A.substring(1);
        String capitalB=B.substring(0,1).toUpperCase()+B.substring(1);
        System.out.println(capitalA+" "+capitalB);
    }
}



