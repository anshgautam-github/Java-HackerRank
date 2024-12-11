/*
Input Format

The first line contains a single string denoting .
The second line contains two space-separated integers denoting the respective values of start and end.

Output Format

Print the substring in the inclusive range from start to end-1.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        String res=S.substring(start,end);
        System.out.println(res);
    }
}
