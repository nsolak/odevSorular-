package day01;

public class odev01 {

	public static void main(String[] args) {
		/*
		Asagidaki String degiskenini kullanarak 
		 konsolda A L i yazdiriniz. 
		String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		*/              

         String pickName="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
         char iHarfi=pickName.toLowerCase().charAt(8);
         System.out.println(pickName.charAt(0)+" "+pickName.charAt(11)+" "+iHarfi);
	System.out.println("buraya syso ekleme yaptım");	
	}

}
