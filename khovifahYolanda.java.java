package javaapplication69;
import java.util.Scanner;
public class JavaApplication69 {
    public static void main(String[] args) {
        Scanner biodata = new Scanner (System.in);
        System.out.println("masukkan nama anda : ");
        String nama = biodata.nextLine();    
        System.out.println("nama : " + nama);
        
        Scanner biodata1 = new Scanner (System.in);
        System. out.println("masukkan tempat tanggal lahir anda : ");
        String lahir = biodata1.nextLine();
        System.out.println("tempat tanggal lahir : " + lahir);
        
        Scanner biodata2 = new Scanner (System.in);
        System.out.println("masukkan alamat anda : ");
        String alamat = biodata2.nextLine();
        System.out.println("alamat : " + alamat);
    }
     
}
