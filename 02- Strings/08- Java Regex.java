/*
Write a class called MyRegex which will contain a string pattern. You need to write a regular expression and assign it to the pattern such that it can be used to 
validate an IP address. Use the following definition of an IP address:
IP address is a string in the form "A.B.C.D", where the value of A, B, C, and D may range from 0 to 255. Leading zeros are allowed. 
The length of A, B, C, or D can't be greater than 3.
*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Solution{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

class MyRegex {
    // Regular expression for validating an IP address
    String pattern = "^((25[0-5]|2[0-4]\\d|1\\d{2}|[0]?\\d{1,2})\\.){3}"
                   + "(25[0-5]|2[0-4]\\d|1\\d{2}|[0]?\\d{1,2})$";
}
