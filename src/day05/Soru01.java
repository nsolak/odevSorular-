package day05;

import java.util.Scanner;

public class Soru01 {

	public static void main(String[] args) {
		/*
		Kullan�c�dan bir isim ve karakter girmesini isteyin, sonra karakterin 
		ka� kez tekrarland���n� kontrol edin.
		e.g:
		char ch1= 'a' ;
		String name =�John came late" 
=> Tekrar Sayisi = 2
		*/

		 
        Scanner scan = new Scanner (System.in);
        System.out.println("L�tfen kac eleman�n tekrar etti�ini g�rmek icin bir kelime giriniz");
        String kelime = scan.nextLine();
        System.out.println("L�tfen tekrar�n� g�rmek istedi�iniz harfi giriniz");
        char harf=scan.next().charAt(0);
        int count=0;
        
        for (int i = 0; i < kelime.length(); i++) {
            if (kelime.charAt(i)==harf) {
                count++;
                
            }
            
        }
        System.out.println("Kelimede aranan harf : "+ count + "defa kullan�ld�" );
        
            
        
        }
        
        
	}


