package day03;

import java.util.Scanner;

public class odev06 {

	public static void main(String[] args) {
		/* 
		Kullanýcýdan firstName ve lastName'i girmesini isteyin, ardýndan baþ harflerini büyük harf yapýn ve geri kalaný tamamen kucuk harf olarak konsolda yazdirin.          
		ferhat => Ferhat
		          	kirac => Kirac
		          */
		    
		  Scanner scan = new Scanner(System.in);
	        
	        System.out.println("Lütfen adýnýzý girin");
	        
	        String name = scan.next();
	        
	        System.out.println("Lütfen soyadýnýzý girin");
	        
	        String surname = scan.next();
	        
	       // System.out.println(name.toUpperCase().charAt(0)+ name.substring(1).toLowerCase());
	        
	      //  System.out.println(surname.toUpperCase().charAt(0)+ surname.substring(1).toLowerCase());
	        
	       // scan.close();
          System.out.print(name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase());
          System.out.print(surname.substring(0, 1).toUpperCase()+surname.substring(1).toLowerCase());

	}

}
