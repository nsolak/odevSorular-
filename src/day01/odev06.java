package day01;

import java.util.Scanner;

public class odev06 {

	public static void main(String[] args) {
		
		/*
		�ki say�y� b�lmek ve ekrana yazd�rmak i�in
		 bir Java program� yaz�n. Edit�re git
		Test Verileri:
		50/3
		Beklenen ��kt� :
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
