package day02;

import java.util.Scanner;

public class odev01 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan email girmesini isteyin
		 * 
		 * @ isareti icermiyorsa “gecerli bir email girin” yazdirin
		 * 
		 * @ isaretinden sonra sadece “gmail.com” yaziyorsa “email onaylandi” yazdirin
		 * 
		 * @ isaretinden sonra “gmail.com” disinda birsey yaziyorsa “Lutfen gmail
		 * hesabinizi girin” yazdirin ORNEK: INPUT : techproed.com OUTPUT : “gecerli bir
		 * email girin” INPUT : techproed@gmail.com OUTPUT : “email onaylandi” INPUT :
		 * techproed@hotmail.com OUTPUT : “Lutfen gmail hesabinizi girin”
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen email'inizi giriniz");

		String mail = scan.nextLine();

		if (mail.contains("@")) {

			int atIsaretiIndex = mail.indexOf("@");
			if (mail.substring(atIsaretiIndex).equals("@gmail.com")) {
				System.out.println("email onaylandi");
			} else {
				System.out.println("Lutfen gmailhesabinizi giriniz");
			}
		} else {
			System.out.println("gecerli bir mail girin");
		}
	}

}
