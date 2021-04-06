package day01;

import java.util.Scanner;

public class odev02 {

	public static void main(String[] args) {
		/*
		Kullaniciya gunde kac cay ictigini 
		ve cayi kac sekerli ictigini sorun. 
		Daha sonra kullanicinin yilda kac kg seker kullandigini 
		hesaplayan java kodunu yaziniz.
		1 seker= 1.7 gr
		Ornek: Input ⇒      
		Cay : 10
		Seker :2
		Output : 12.41 kg/yil
        */
        Scanner scan=new Scanner(System.in);
        System.out.println("Gunde kac adet cay icersiniz");
        double cay=scan.nextDouble();
        System.out.println("cayınıza kac adet seker atarsiniz" );
		double seker= scan.nextDouble();
		
	System.out.println("Bir yilda tükettiginiz toplam seker miktari :"+(cay*seker*365*(1.7/1000))+"kg");
		
	
	}

}
