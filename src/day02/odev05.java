package day02;

import java.util.Scanner;


public class odev05 {

	public static void main(String[] args) {
		/* 
		Kullanýcýný 1 ile 7 arasýnda bir sayý girdiðinde haftanýn hangi günü olduðunu yazdýran switch case java kodunu yazinýz.
				 */

       Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen 1 ile 7 arasinda bir sayi giriniz");
		
		int gun=scan.nextInt();
		switch(gun) {
		case 1:
			System.out.println("pazartesi");
			break;
		case 2:
			System.out.println("sali");
			break;
		case 3:
			System.out.println("carsamba");
			break;
		case 4:
			System.out.println("persembe");
			break;
		case 5:
			System.out.println("cuma");
			break;
		case 6:
			System.out.println("cumartesi");
			break;
		case 7:
			System.out.println("pazar")/* 
			Kullanicidan 3 tane pozitif  tam sayi alalim
			bu uc sayidan ucgen olup olmama durumunu kontrol edelim
			eger ucgen olabiliyor ise, es kenar ucgen mi kontrol edelim.

			* Ucgen olma kosullari.
			b+c>a>b-c  1
			a+c>b>a-c  1
			a+b>c>a-b 1

			* Eskenar ucgen olma kosullari.
			a=b=c 

			Konsolda asagidaki durumlari yazdiralim.
			Eskenar ucgen
			Sadece ucgen
			Ucgen degildir
			         */
	        Scanner scan = new Scanner(System.in);
	        System.out.println("3 tane pozitif tam sayi giriniz"); 
	        int tamsayi=scan.nextInt();
	        System.out.println("Lutfen birinci giriniz");
	        int a=scan.nextInt();
	        System.out.println("Lutfen ikinci sayiyigiriniz");
	        int b=scan.nextInt();
	        System.out.println("Lutfen  ucuncu sayiyi  giriniz");
	        int c=scan.nextInt();
	        
	        if(a==b && b==c && a==c) {
	        	System.out.println("eskenar ucgendir");
	        }else if((b+c)>a && a>(b-c) || (a+c)>b && b>(a-c) || (a+b)>c && c>(a-b)) {
	        	System.out.println("sadece ucgendir");
	        }else {
	        	System.out.println("ucgen degildir");
	        }
	        
	        	
	        		
		}

	};
			default:
				System.out.println("lutfen belirtilen aralkta bir rakam giriniz");
				break;
	}

	}
}