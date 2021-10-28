// Michelle Winardi- 51019016

import java.util.Scanner;

class hitungpln {
	int x,y,z;
	
  //Method Untuk hitung harga listrik pln
 	int hargabayar (int tiperumah, char blokrumah) {
	 		if (tiperumah == 36 & blokrumah == 'A'){
	 			x = 500000;	
	 		} else
	 		if (tiperumah == 36 & blokrumah == 'B'){
	 			x = 300000;	
	 		} else
	 		if (tiperumah == 37 & blokrumah == 'A'){
	 			x = 800000;
	 		} else 
	 		if (tiperumah == 37 & blokrumah == 'B'){
	 			x = 600000;
	 		} 
	 return x;		
 	} 
  //Method Untuk Cetak Harga Bayar 
  	void cetakharga (){
  			System.out.println("Total Harga Listrik Rumah Anda : " + x);
  	}
  //Method Untuk Hitung Kembalian 
  	int kembalian (int uangbayar){
  			 z = uangbayar - x;
 			return z;
 	}
 	
}


public class HadiahPrak4 {
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		char blok;
		String nama, alamat;
		int bayar, tipe_rumah;
		
		//Proses Instansiasi Objeck pln 
		hitungpln pln = new hitungpln();
		//Proses Instansiasi Objeck pln
		
		
		System.out.println("Aplikasi class dan object untuk Aplikasi pembayaran PLN");
		System.out.println();
		
		//Proses Input Nilai luaslingkaran dan volumekubus 
		System.out.print("Masukkan Nama Anda : ");
		nama = input.nextLine();
		System.out.print("Masukkan Alamat Anda  : ");
		alamat = input.nextLine();
		System.out.println("Masukkan Tipe Rumah Anda");
		System.out.println("Tipe Yang Tersedia : \n36\n37");
		System.out.print("Tipe Rumah Anda : ");
		tipe_rumah = input.nextInt();
		System.out.println("Masukkan Blok Rumah Anda");
		System.out.println("Blok Yang Tersedia : \nA\nB");
		System.out.print("Blok Rumah Anda : ");
		blok = input.next().charAt(0);
		System.out.println();
		pln.hargabayar(tipe_rumah,blok);
		pln.cetakharga();
		System.out.print("Masukkan Jumlah Uang anda : ");
		bayar = input.nextInt();
		
		System.out.println();
		
		System.out.println("Nama Anda : " + nama);
		System.out.println("Alamat Anda : " + alamat);
		pln.cetakharga();
		System.out.println("Jumlah Uang anda : " + bayar);
		System.out.println("Kembalian Uang anda : " + pln.kembalian(bayar));
		
	}	
}