package day05;

import java.util.Scanner;

public class Soru01Tekrar {

	public static void main(String[] args) {
		  /*
         * Kullan�c�dan bir isim ve karakter girmesini isteyin, sonra karakterin ka� kez
         * tekrarland���n� kontrol edin. e.g: char ch1= 'a' ; String name =�John came
         * late" => Tekrar Sayisi = 2
         */
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Bir Isim Giriniz");
        String isim = scan.nextLine().trim();
        
        System.out.println("Lutfen Bir Harf Giriniz");
        char karakter = scan.next().charAt(0);
        
        String arr[]=isim.split("");
        
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].charAt(0)==karakter) {
                count++;
            } 
        }
        System.out.println(karakter + " harfi \""+isim+"\" kelimesinde "+ count+ " kez kullan�lm��t�r.");
        scan.close();
    }

	



	}


