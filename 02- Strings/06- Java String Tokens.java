/*
Given a string, s, matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens.
We define a token to be one or more consecutive English alphabetic letters. 
Then, print the number of tokens, followed by each token on a new line.

Note: You may find the String.split method helpful in completing this challenge.
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();
        
        s = removeLeadingNonLetters(s); //Edge case handle mandatory
        
        if (s.length() == 0) {
            System.out.println(0);
            return;
        }
        
        String tokens[]=s.split("[^A-Za-z]+");

        System.out.println(tokens.length);
        for(String token:tokens){
            if(!token.isEmpty()){
                System.out.println(token);
            }
        }
     }
  
        private static String removeLeadingNonLetters(String str) {
        int i;
        for (i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                break;
            }
        }
        return str.substring(i);
    }
    }
