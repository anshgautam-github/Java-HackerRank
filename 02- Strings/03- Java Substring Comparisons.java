/*
Given a string,s , and an integer,k , complete the function so that it finds the lexicographically smallest and largest substrings of length k .

Sample Input:
welcometojava
3

Sample Output:
ava
wel

*/

import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
       
           String smallest = s.substring(0, k); // First substring
           String largest = s.substring(0, k); // First substring
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        // Generate and compare substrings
        for (int i = 1; i <= s.length() - k; i++) {
            String substring = s.substring(i, i + k); // Current substring
            if (substring.compareTo(smallest) < 0) {
                smallest = substring; // Update smallest
            }
            if (substring.compareTo(largest) > 0) {
                largest = substring; // Update largest
            }
        }
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
