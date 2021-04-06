package day06;

import java.util.Arrays;

public class Soru03 {

	public static void main(String[] args) {
		/*
         * SORU 3) Kullanicidan 100 den kucuk bir tamsayi isteyip, bu sayinin daha
         * onceden tanimlanmis array’de olup olmadigini kullaniciya donen bir method
         * yaziniz
         *
         * Array={3,5,21,32,34,45,56,57,76,87,95}
         *
         * Input : 5  Output: Girdiginiz sayi Arrayde var
         * Input : 15 Output: Girdiginiz sayi Arrayde yok
         */

		  int arr1[]= {3,5,5,21,32,34,45,56,56,57,76,76,87,95};
	        int count=0;
	        int arr2[]=new int[arr1.length-count];
	        
	        int tekrareden=0;
	        
	        for (int i = 0; i < arr1.length; i++) {
	            for (int j = i+1; j < arr1.length; j++) {
	                if (arr1[i]==arr1[j]) {
	                    
	                    
	                //  arr2[tekrareden]=arr1[i];
	                //  tekrareden++;
	                    count++;
	            System.out.println(Arrays.toString(arr2));
	                }
	            }
	            
		
		
	        }
	       
	}
	
}
        
