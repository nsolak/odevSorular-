package day05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soru04 {

	public static void main(String[] args) {
		/*
		Get numbers from the user and output that number consecutive fibonacci number sequence
		     	e.g : User enters 10
		output : 0 1 1  2  3  5 8 13 21 34
		      	*/

		 Scanner scan= new Scanner(System.in);
		 
		    System.out.println("Lutfen pozitif bir sayi giriniz.");
		    int sayi=scan.nextInt();
		    
		    List<Integer> fibo= new ArrayList<>();
		    fibo.add(1);
		    fibo.add(1);
		    
		    
		    for (int i = 2 ; fibo.get(i-2)+ fibo.get(i-1) < sayi; i++) {
		        
		        fibo.add(fibo.get(i-2)+ fibo.get(i-1));
		        
		    }
		    System.out.println(fibo);
		    
		    
		    }
		    
		
	}


