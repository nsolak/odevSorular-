package day05;

public class Soru02Tekrar {

	public static void main(String[] args) {
		int[] sayi = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        
        
        sayilarinToplami(sayi);
        System.out.println();
        tekSayi (sayi);
        System.out.println();
        
        bolunebilen5(sayi);
        
            
        }
        public static void bolunebilen5(int[] sayi) {
            for (int i = sayi.length-1; i >=0 ; i--) {
                if (sayi[i]%5==0) {
                    System.out.print(sayi[i] + " ");
                }
                
                
            }
            
            
        }
        public static void tekSayi(int[] sayi) {
            for (int i = 0; i < sayi.length; i++) {
                if (sayi[i]%2==1) {
                    System.out.print(sayi[i] + ",");
                }
                
            }
            
            
            
        }
        
        
    public static void sayilarinToplami(int[] sayi) {
        for (int i = 0; i < sayi.length; i++) {
            if (sayi[i]%2==0) {
                System.out.print(sayi[i] + " ");
            }
        }

	}

}
