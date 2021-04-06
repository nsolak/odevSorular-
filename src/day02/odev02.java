package day02;

import java.util.Scanner;

public class odev02 {

	public static void main(String[] args) {
		/*
        Print "Lütfen iþ unvanýnýzý girin” 
        “jobTitle” isimli bir degisken olusturun ve kullanicidan isteyin.
        Doðru jobTitle yazdýrmak için aþaðýdaki test datalarini kullanýn. Example :
        Eger jobTitle  qa ise print “Ýþ unvanýnýz Quality Analyst” 
        test data: qa ise print Quality Analyst 
        dev ise print Developer 
        ba ise print Business Analyst 
        pm ise print Project Manager
       */

		Scanner scan =new Scanner(System.in);
		System.out.println("Lutfen is unvaninizi girin");
		
       String jobTible = scan.next().toLowerCase();
       
       if(jobTible.equals("qa")) {
    	   System.out.println("is unvaniniz Quality Analyst");
    	   
       }else if(jobTible.equals("dev")) {
    	   System.out.println("is unvaniniz developer");
       }else if(jobTible.equals("ba")) {
    	   System.out.println("is unvaniniz Business Analyst");
       }else if(jobTible.equals("pm")) {
    	   System.out.println("is unvaniniz Project Manager");
       }else {
    	  System.out.println("Lutfen gecerli bir is unvani giriniz"); 
       }
       scan.close();
}
}