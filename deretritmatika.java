import java.util.Scanner;  
  
public class deretritmatika {  
   public static void main(String[] args) { 
    int batasAwal=0, batasAkhir=0, beda, pilihan;

      Scanner i = new Scanner(System.in);  
  
      System.out.print("Masukkan batas awal: ");  
      batasAwal = i.nextInt();  
  
      System.out.print("Masukkan batas akhir: ");  
      batasAkhir = i.nextInt();  
  
      System.out.print("Masukkan beda: ");  
      beda = i.nextInt();  
  
      System.out.print("Pilih loop: (1) \nFor, (2) While: ");  
      pilihan = i.nextInt();  
  
      if (pilihan == 1) {  
        // Menggunakan loop for  
        for (int j = batasAwal; j <= batasAkhir; j += beda) {  
           System.out.print(j+ " ");  
        }  
      } else if (pilihan == 2) {  
        // Menggunakan loop while  
        int j = batasAwal;  

        while (j <= batasAkhir) {  
           System.out.print(i + " ");  
           j += beda;  
        }  
      } else {  
        System.out.println("Pilihan tidak valid"); 

  }
}
}