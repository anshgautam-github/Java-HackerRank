/*
Given a large integer, n, use the Java BigInteger class' isProbablePrime method to determine and print whether it's prime or not prime.
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();

        bufferedReader.close();
        
        BigInteger num=new BigInteger(n);
        if(num.isProbablePrime(10)){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }
    }
}
