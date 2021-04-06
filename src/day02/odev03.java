package day02;

import java.util.Scanner;

public class odev03 {

	public static void main(String[] args) {
		/*
		“NestedIfStatements” class olusturun.
		
	Kullanicidan 2 kisi icin dogum gunu girmesini isteyin.
		
	Yýlý, ayi ve günü tamsayý olarak alýn ve 
	NestedIf kullanarak kimin yas olarak daha buyuk oldugunu ekrana yazdirin. 
	Examples:
		int birthYearOfYusuf=2000, birthMonthOfYusuf=12, birthDayOfYusuf=12,
        int birthYearOfMehmet=2000,birthMonthOfMehmet=12, birthDayOfMehmet=21;
	Yusuf is Older            
*/
		Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir kisinin dogum gununu giriniz ");
        int birthYearOfYusuf = scan.nextInt();
        int birthMonthOfYusuf = scan.nextInt();
        int birthDayOfYusuf =  scan.nextInt();
        System.out.println("Lutfen ikinci kisinin dogum gununu giriniz");
        int birthYearOfMehmet = scan.nextInt();
        int birthMonthOfMehmet = scan.nextInt();
        int birthDayOfMehmet =  scan.nextInt();
     // nested if'den daha kolay hali yil ay ve gun'u birlestirip bir sayi elde edelim
        int yusufDogumTarihi=birthYearOfYusuf*10000 + birthMonthOfYusuf*100+birthDayOfYusuf;//19961105 gibi yaptim
        int mehmetDogumTarihi=birthYearOfMehmet*10000 + birthMonthOfMehmet*100+birthDayOfMehmet;
        if (yusufDogumTarihi<mehmetDogumTarihi) {
            System.out.println("Yusuf daha buyuk");
        } else if (yusufDogumTarihi>mehmetDogumTarihi){
            System.out.println("Mehmet daha buyuk");
        } else {
            System.out.println("ikisi ayni gun dogmus");
            

    	 }
        // =============== nested ile cozmek istersen, once yilla baslayalim
        if (birthYearOfYusuf<birthYearOfMehmet) {
            System.out.println("Yusuf daha buyuk");   
        } else if (birthYearOfYusuf>birthYearOfMehmet) {
            System.out.println("Mehmet daha buyuk");
        } else { // bu satira geldiginde yillar esit demektir aylara bakmam lazim
            
            if (birthMonthOfYusuf<birthMonthOfMehmet) {
                System.out.println("Yusuf daha buyuk");   
            } else if (birthMonthOfYusuf>birthMonthOfMehmet) {
                System.out.println("Mehmet daha buyuk");
            } else { // bu satira geldiyse hem yil hem de ay ayni demek
                if (birthDayOfYusuf<birthDayOfMehmet) {
                    System.out.println("Yusuf daha buyuk");
                } else if (birthDayOfYusuf>birthDayOfMehmet) {
                    System.out.println("Mehmet daha buyuk");
                } else {
                    System.out.println("ikisi ayni gun dogmus");
                }
            }
            
            
        }

	}

}
