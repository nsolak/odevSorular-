package day01;

import java.util.Scanner;

public class odev04 {

	public static void main(String[] args) {
		
		/*
		Kullanicidan 3 basamakli bir sayi isteyin 
		ve bu sayinin basamaklari toplamini konsolda
		 yazdiran programi yaziniz.
		*/
		Scanner scan= new Scanner(System.in);
		System.out.println("Uc basamakli bir sayi giriniz");
		int num= scan.nextInt();
		
		int numYuzler=num/100;
		int numOnlar=(num/10)%10;
		int numBirler=num%10;
		
		if (num>100 && num<1000) {
			System.out.println("Basamaklarin toplami :"+(numYuzler+numOnlar+numBirler));
		} else {
            System.out.println("dogru sayi giriniz");
            scan.close();
		}
		
		
	}

}

