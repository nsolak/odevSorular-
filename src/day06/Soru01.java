package day06;

public class Soru01 {

	public static void main(String[] args) {
		/*
		// Stringi ters çevirmek için bir Java Programı yazın
//1.Yol: StringBuilder () kullanarak
//2.Yol: String Classini kullanarak
//3.Yol: Bir method oluşturun, ardından methodu main method dan çağırın
*/
		StringBuilder str1=new StringBuilder();
		str1.append("Java Güzeldir");
		str1.reverse();
		System.out.println(str1);
		
		String ters="";
		String str= "Java Güzeldir";
		for (int i = str.length()-1; i >= 0 ; i--) {
			ters+=str.charAt(i);
		}System.out.println(ters);

		
		System.out.println(stringTers());
	}
	public static String stringTers() {
		
		String ters="";
		String str= "Java Güzeldir";
		for (int i = str.length()-1; i >= 0 ; i--) {
			ters+=str.charAt(i);
		}
		
		return ters;
	}

	}


