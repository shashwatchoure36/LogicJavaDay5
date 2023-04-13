package com.logicjava;
import java.util.Scanner;

public class CuponNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double  dis,amount,marketprice,s;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter markedprice ");	
	               
		marketprice=sc.nextDouble();
	 
	        System.out.println("enter discount percentage ");	
	               
		dis=sc.nextDouble();			
		
	        s=100-dis;
	 
		amount= (s*marketprice)/100;
	 
		System.out.println("amount after discount="+amount);

	}

}
