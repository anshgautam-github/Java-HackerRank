import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {


    static int B;  // Breadth of the parallelogram
    static int H;  // Height of the parallelogram
    static boolean flag = true;  // Flag to check validity of the inputs
    
    // Static block to initialize the values and perform input validation
    static {
        Scanner sc = new Scanner(System.in);
        
        try {
            B = sc.nextInt();  // Read breadth
            H = sc.nextInt();  // Read height
            
            // Validate the inputs: both B and H must be positive
            if (B <= 0 || H <= 0) {
                flag = false;  // If invalid, set flag to false
                throw new Exception("Breadth and height must be positive");
            }
        } catch (Exception e) {
            // If an exception occurs (invalid input), print the exception message
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

