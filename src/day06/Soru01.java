package day06;

public class Soru01 {

	public static void main(String[] args) {
		/*
		// Stringi ters �evirmek i�in bir Java Program� yaz�n
//1.Yol: StringBuilder () kullanarak
//2.Yol: String Classini kullanarak
//3.Yol: Bir method olu�turun, ard�ndan methodu main method dan �a��r�n
*/
		StringBuilder str1=new StringBuilder();
		str1.append("Java G�zeldir");
		str1.reverse();
		System.out.println(str1);
		
		String ters="";
		String str= "Java G�zeldir";
		for (int i = str.length()-1; i >= 0 ; i--) {
			ters+=str.charAt(i);
		}System.out.println(ters);

		
		System.out.println(stringTers());
	}
	public static String stringTers() {
		
		String ters="";
		String str= "Java G�zeldir";
		for (int i = str.length()-1; i >= 0 ; i--) {
			ters+=str.charAt(i);
		}
		
		return ters;
	}

	}


