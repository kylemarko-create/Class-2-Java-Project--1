// Using recursion, create a program that allows 
// a user to enter five numbers. 
// The program will then provide the product of all five numbers 
// using recursive methods.

import java.util.Scanner;

public class recursionassignment {

    public static int calculatedProduct(int n) {
        // The Base Case
        if (n == 0) {
            return 1;
        }
        // The Recursive Case
        else {
            System.out.println("Input a number");
            Scanner newObj = new Scanner(System.in);
            int userNum = newObj.nextInt();
            return userNum * calculatedProduct(n - 1);
        }
    }

    public static void main(String[] args) {
        int result = calculatedProduct(5);
        System.out.println("The Result is:" + result);
        
    }
}