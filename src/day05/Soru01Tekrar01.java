package day05;

public class Soru01Tekrar01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		System.out.println("Lüttfen kac elemanýn tekrar ettigini görmek icin bir kelime giriniz");
		String kelime = scan.nextLine();
		System.out.println("Lutfen tekrarini gormek istediginiz harfi giriniz");
		char harf=scan.next().charAt(0);
		int count=0;
		
		for (int i = 0; i < kelime.length(); i++) {
			if (kelime.charAt(i)==harf) {
				count++;
				
			}
			
		}
		System.out.println("Kelimede aranan harf : "+ count + "defa kullanildi" );
		
			
		

	}

}
