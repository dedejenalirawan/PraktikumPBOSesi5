
import java.util.Scanner;

/**
 * @author Dede Jenal Irawan
 */
public class HitungBangunDatar {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("1. Bujur Sangkar");
        System.out.println("2. Persegi Panjang");
        System.out.println("------Isikan Pilihan-----");
        
        int pilih = sc.nextInt();
        if(pilih==1){
            System.out.println("Masukan Nilai Sisi");
            int s = sc.nextInt();
            BujurSangkar bs= new BujurSangkar(s);
            
            System.out.println(bs);
        }
        else if (pilih==2){
            System.out.println("Menghitung Luas Dan Persegi Panjang");
            System.out.println("------------------------------------");
            System.out.println("Masukan Nilai Panjang");
            
            int p = sc.nextInt();
            
            System.out.println("Masukan Nilai Lebar");
            int l = sc.nextInt();
            
            PersegiPanjang pp= new PersegiPanjang(p,l);
            System.out.println(pp);
        }
    }
    
}
