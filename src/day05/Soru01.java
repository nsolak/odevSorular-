package day05;

import java.util.Scanner;

public class Soru01 {

	public static void main(String[] args) {
		/*
		Kullanýcýdan bir isim ve karakter girmesini isteyin, sonra karakterin 
		kaç kez tekrarlandýðýný kontrol edin.
		e.g:
		char ch1= 'a' ;
		String name =“John came late" 
=> Tekrar Sayisi = 2
		*/

		 
        Scanner scan = new Scanner (System.in);
        System.out.println("Lütfen kac elemanýn tekrar ettiðini görmek icin bir kelime giriniz");
        String kelime = scan.nextLine();
        System.out.println("Lütfen tekrarýný görmek istediðiniz harfi giriniz");
        char harf=scan.next().charAt(0);
        int count=0;
        
        for (int i = 0; i < kelime.length(); i++) {
            if (kelime.charAt(i)==harf) {
                count++;
                
            }
            
        }
        System.out.println("Kelimede aranan harf : "+ count + "defa kullanýldý" );
        
            
        
        }
        
        
	}


