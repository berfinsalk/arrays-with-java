package diziodevi;

import java.util.Arrays;
import java.util.Scanner;

public class diziodevi {

	public static void main(String[] args) {
		// kullanıcıdan sayı alıp dizide olup olmadığını yazdırma, dizide varsa kaçıncı indeks?
		 /*Scanner scanner = new Scanner(System.in);
	        // Değişken Tanımlaması:
	        int veriTut,veriAra;
	        // Dizi Tanımlaması Gerçekleştirdik:
	        int [] myArray = {14,68,74,2,13,69,84};
	        Arrays.sort(myArray); // Dizimizi Küçükten Büyüğe Sıraladık.
	        System.out.print("Dizi İçerisinde Aramak İstediğiniz Değer: ");
	        veriAra=scanner.nextInt();
	        veriTut = Arrays.binarySearch(myArray,veriAra);
	        System.out.print("-----\n- Dizi Elemanları:");
	        for(int i=0;i<myArray.length;i++){
	            System.out.print("["+myArray[i]+"]");
	        }
	        System.out.println("\n-----");
	        if(veriTut<0)
	            System.out.println("Arama Yaptığınız Değeri Bulamadım.");
	        else
	            System.out.println("Arama Yaptığınız "+veriAra+" Değeri "+veriTut+" İndisinde Bulunuyor.");
			*/
		
		// dizinin içindeki bir elemanın kaçıncı indis olduğunu yazdırma
		int arama;//Dizide arama yapmak ve ekrana yazdırmak için değişken tanımladık.
	    int dizi [] = {67,98,34,21,90,56};//dizi dizisi içerisine sayıları girdik
	    arama = Arrays.binarySearch(dizi, 34);//dizi dizisinde 34 sayısını arattık.
	    System.out.println("34 sayısının indisi = "+arama);//ekrana yazdırdık
	    
	}

}
