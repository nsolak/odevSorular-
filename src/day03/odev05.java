package day03;

import java.util.Scanner;

public class odev05 {

	public static void main(String[] args) {
		/*
		Kullanýcýdan bir kelime girmesini isteyin. Sözcükte tek sayýda karakter ve
		 3 veya daha fazla karakter içeriyorsa, kelimenin ortasýndaki karakteri yazdýrýn.
		*/
Scanner scan = new Scanner(System.in);
        
        System.out.println("Lütfen bir kelime girin");
        
        String kelime = scan.next();
        
        if(kelime.length()%2==1 && kelime.length()>=3) {
            
            System.out.println(kelime.charAt(kelime.length()/2));
            
        }else {
            System.out.println("Kelime çift karakterli");
        }
        
        scan.close();
        

	}

}
