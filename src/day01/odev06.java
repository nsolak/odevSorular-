package day01;

import java.util.Scanner;

public class odev06 {

	public static void main(String[] args) {
		
		/*
		Ýki sayýyý bölmek ve ekrana yazdýrmak için
		 bir Java programý yazýn. Editöre git
		Test Verileri:
		50/3
		Beklenen Çýktý :
		16
		*/
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen birinci sayi giriniz");
		int a= scan.nextInt();
		System.out.println("Lutfen ikinci sayiyi giriniz");
		int b = scan.nextInt();
		int d=(a/b);
		System.out.println("beklenen cikti:"+d);
		
		
		
	}

}
