package com.anna.cs;  
 
public class Prgm11_Krishnamoorthyno {
	 // function to calculate the factorial 
    // of any number 
    static int factorial(int n) 
    { 
        int fact = 1; 
        while (n != 0) { 
            fact = fact * n; 
            n--; 
        } 
        return fact; 
    } 
  
    // function to Check if number is krishnamoorthy 
    static boolean isKrishnamoorthy(int n) 
    { 
        int sum = 0; 
  
        int temp = n; 
        while (temp != 0) { 
            // calculate factorial of last digit 
            // of temp and add it to sum 
            sum += factorial(temp % 10); 
            // replace value of temp by temp/10 
            temp = temp / 10; 
        } 
  
        // Check if number is krishnamoorthy 
        return (sum == n); 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int n = 145; 
        if (isKrishnamoorthy(n)) 
            System.out.println("n is krishnamoorthy number"); 
        else
            System.out.println("n is not a krishnamoorthy number"); 
    } 
} 

