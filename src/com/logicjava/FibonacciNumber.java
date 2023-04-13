package com.logicjava;
import java.util.Scanner;

public class FibonacciNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        fibonacci();

	}

	private static void fibonacci() {
		// TODO Auto-generated method stub
		
        int n, a = 0, b = 0, c = 1;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter value of n:");
        n = s.nextInt();
        System.out.print("Fibonacci Series:");
        for(int i = 0; i <= n; i++)
        {
            a = b;
            b = c;
            c = a + b;
            System.out.println(a+" ");
        }
		
	}

}
