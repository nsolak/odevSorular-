package day03;

import java.util.Scanner;

public class odev02 {

	public static void main(String[] args) {
		  
		 			
        /*  
         * Kullanicinin girmis oldugu ay icin 
          * kac gun oldugunu yazdiran Switch Case java kodunu yaziniz.
	     */
					
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir ay adi giriniz");
		
		String ay=scan.next().toLowerCase();
        switch(ay) {
        case"ocak":
        	System.out.println("ocak ayi 31 gundur");
        	break;
        case"subat":
        	System.out.println("suabt ayi 28 gundur");
        	break;
        case"mart":
        	System.out.println("mart ayi 31 gundur");
        	break;
        case"nisan":
        	System.out.println("nisan ayi 30 gundur");
        	break;
        case"mayis":
        	System.out.println("mayis ayi 31 gundur");
        	break;
        case"haziran":
        	System.out.println("haziran ayi 30 gundur");
        	break;
        case"temmuz":
        	System.out.println("temmuz ayi 31 gundur");
        	break;
        case"ogustos":
        	System.out.println("ogustos ayi 31 gundur");
        	break;
        case"eylul":
        	System.out.println("eylul ayi 30 gundur");
        	break;
        case"ekim":
        	System.out.println("ekim ayi 31 gundur");
        	break;
        case"kasim":
        	System.out.println("kasim ayi 30 gundur");
        	break;
        case"aralik":
        	System.out.println("aralik ayi 31 gundur");
        	break;
        	default:
        		System.out.println("Lutfen kullanicinin istedigi bir ay adi giriniz ");
        }
	}

}
