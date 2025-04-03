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
// ✅ Time Complexity: O(n), because reversing a string takes O(n), and comparing takes another O(n).
// ✅ Space Complexity: O(n), due to storing the reversed string.


/*      Another way but it takes O(n^2) time complexity

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();
        
        int left = 0;
        int right = str.length() - 1;
        boolean isPalindrome = true;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        System.out.println(isPalindrome ? "Yes" : "No");
    }
}

Time Complexity: O(n/2) ≈ O(n), as we only iterate half the string.
✅ Space Complexity: O(1), as we don’t store extra strings.


*/
