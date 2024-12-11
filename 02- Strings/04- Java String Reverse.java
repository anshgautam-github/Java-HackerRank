/*
A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.
Given a string A, print Yes if it is a palindrome, print No otherwise.
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String reverse=new StringBuilder(A).reverse().toString();
        if(A.equals(reverse)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
    }
}


/*      Another way but it takes O(n^2) time complexity

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        
        // Initialize an empty string for reversed version
        String reversed = "";
        
        // Loop through the string from end to start
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i);  // Concatenate each character in reverse order
        }
        
        // Check if the original string is equal to the reversed string
        if (s.equals(reversed)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}


*/
