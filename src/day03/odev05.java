package day03;

import java.util.Scanner;

public class odev05 {

	public static void main(String[] args) {
		/*
		Kullan�c�dan bir kelime girmesini isteyin. S�zc�kte tek say�da karakter ve
		 3 veya daha fazla karakter i�eriyorsa, kelimenin ortas�ndaki karakteri yazd�r�n.
		*/
Scanner scan = new Scanner(System.in);
        
        System.out.println("L�tfen bir kelime girin");
        
        String kelime = scan.next();
        
        if(kelime.length()%2==1 && kelime.length()>=3) {
            
            System.out.println(kelime.charAt(kelime.length()/2));
            
        }else {
            System.out.println("Kelime �ift karakterli");
        }
        
        scan.close();
        

	}

}
