/*
Two strings, a  and b , are called anagrams if they contain all the same characters in the same frequencies. For this challenge, the test is not case-sensitive. 
For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.
*/


import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
         // If lengths are different, they cannot be anagrams
        if (a.length() != b.length()) {
            return false;
        }

        // Convert strings to lowercase for case-insensitivity
        a = a.toLowerCase();
        b = b.toLowerCase();

        // Create frequency arrays for both strings
        int[] freqA = new int[26]; // For string a
        int[] freqB = new int[26]; // For string b

        // Populate frequency arrays
        for (int i = 0; i < a.length(); i++) {
            freqA[a.charAt(i) - 'a']++; // Increment count for character in string a
            freqB[b.charAt(i) - 'a']++; // Increment count for character in string b
        }

        // Compare frequency arrays
        for (int i = 0; i < 26; i++) {
            if (freqA[i] != freqB[i]) {
                return false;
            }
        }

        return true; 
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
