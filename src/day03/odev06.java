package day03;

import java.util.Scanner;

public class odev06 {

	public static void main(String[] args) {
		/* 
		Kullan�c�dan firstName ve lastName'i girmesini isteyin, ard�ndan ba� harflerini b�y�k harf yap�n ve geri kalan� tamamen kucuk harf olarak konsolda yazdirin.          
		ferhat => Ferhat
		          	kirac => Kirac
		          */
		    
		  Scanner scan = new Scanner(System.in);
	        
	        System.out.println("L�tfen ad�n�z� girin");
	        
	        String name = scan.next();
	        
	        System.out.println("L�tfen soyad�n�z� girin");
	        
	        String surname = scan.next();
	        
	       // System.out.println(name.toUpperCase().charAt(0)+ name.substring(1).toLowerCase());
	        
	      //  System.out.println(surname.toUpperCase().charAt(0)+ surname.substring(1).toLowerCase());
	        
	       // scan.close();
          System.out.print(name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase());
          System.out.print(surname.substring(0, 1).toUpperCase()+surname.substring(1).toLowerCase());

	}

}
