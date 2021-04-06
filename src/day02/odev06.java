package day02;

import java.util.Scanner;

public class odev06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 ​
		         System.out.println("Lutfen 1 kisinin ismini giriniz: ");
		         String name1 = scan.next();
		         System.out.println("Lutfen 1 kisinin dogum yilini giriniz: ");
		         int yil1 = scan.nextInt();
		         System.out.println("Lutfen 1 kisinin dogum ayini giriniz: ");
		         int ay1 = scan.nextInt();
		         System.out.println("Lutfen 1 kisinin dogum gununu giriniz: ");
		         int gun1 = scan.nextInt();
		 ​
		         System.out.println("Lutfen 2 kisinin ismini giriniz: ");
		         String name2 = scan.next();
		         System.out.println("Lutfen 2 kisinin dogum yilini giriniz: ");
		         int yil2 = scan.nextInt();
		         System.out.println("Lutfen 2 kisinin dogum ayini giriniz: ");
		         int ay2 = scan.nextInt();
		         System.out.println("Lutfen 2 kisinin dogum gununu giriniz: ");
		         int gun2 = scan.nextInt();
		 ​
		         if ((yil1 == yil2) && (ay1 == ay2) && (gun1 == gun2)) {
		 ​
		             System.out.println("Yaslar esit");
		         } else if ((yil1 == yil2) && (ay1 == ay2)) {
		 ​
		             if (gun1 > gun2) {
		 ​
		                 System.out.println(name2 + " daha yasli");
		             } else {
		 ​
		                 System.out.println(name1 + " daha yasli");
		             }
		 ​
		         } else if (yil1 == yil2) {
		 ​
		             if (ay1 > ay2) {
		 ​
		                 System.out.println(name2 + " daha yasli");
		             } else {
		 ​
		                 System.out.println(name1 + " daha yasli");
		             }
		 ​
		         } else if (yil1 > yil2) {
		 ​
		             System.out.println(name2 + " daha yasli");
		         } else {
		 ​
		             System.out.println(name1 + " daha yasli");
		         }
		 ​
		         scan.close();
		 ​
		     }

	


	}


